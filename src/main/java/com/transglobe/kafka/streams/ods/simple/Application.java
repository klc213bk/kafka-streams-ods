package com.transglobe.kafka.streams.ods.simple;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.transglobe.kafka.streams.ods.common.ProductionDetail;


public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.warn(">>> Stream Application is running !!!");
		try {
			Properties prop = ConfigUtils.getProperties("config.properties");
			String bootstrapServers = prop.getProperty("bootstrap.servers");
			String applicationId = prop.getProperty("application_id");
			String sourceTopic = prop.getProperty("stream.source.topic");
			String sinkTopic = prop.getProperty("stream.sink.topic");
			String sinkTable = prop.getProperty("sink.table");
			String sinkSegOwner = sinkTable.split("\\.")[0];
			String sinkTableName = sinkTable.split("\\.")[1];

			Properties props = new Properties();
			props.put(StreamsConfig.APPLICATION_ID_CONFIG, applicationId);
			props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
			props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
			props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

			final StreamsBuilder builder = new StreamsBuilder();

			KStream<String, String> source = builder.stream(sourceTopic);

			source.map((key, value) -> {
//				logger.warn("key={}", key);
//				logger.warn("value={}", value);
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					JsonNode jsonNode = objectMapper.readTree(value);
					String redoStr = jsonNode.get("payload").get("SQL_REDO").asText();
					String sourceSegOwner = jsonNode.get("payload").get("SEG_OWNER").asText();
					String sourceTableName = jsonNode.get("payload").get("TABLE_NAME").asText();
					String sourceTableStr = String.format("\"%s\".\"%s\"", sourceSegOwner, sourceTableName);
					String sinkTableStr = String.format("\"%s\".\"%s\"", sinkTable.split("\\.")[0], sinkTable.split("\\.")[1]);
					ObjectNode on = (ObjectNode)jsonNode.get("payload");
					on.put("SINK_SEG_OWNER", sinkSegOwner);
					on.put("SINK_TABLE_NAME", sinkTableName);
					on.put("SQL_REDO", redoStr.replace(sourceTableStr, sinkTableStr));
					
					String dataContent = jsonNode.get("payload").get("data").toString();
					logger.warn("dataContent={}", dataContent);
					ObjectMapper objectMapper2 = new ObjectMapper();
					ProductionDetail detail = objectMapper2.readValue(dataContent, ProductionDetail.class);
					
					java.util.Date utilDate = new java.util.Date();
					LocalDate localDate = LocalDate.now();
					Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
					detail.setDataDate(date);
					detail.setTblUpdTime(utilDate);
					
					on.put("SINK_DATA", objectMapper2.writeValueAsString(detail));
					
					logger.warn("detail={}", ToStringBuilder.reflectionToString(detail));
	
					return new KeyValue<>(key, jsonNode.toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					logger.error(e.getMessage(), e);
					return new KeyValue<>("", "");
				} 
				
			})
			.to(sinkTopic);

			final Topology topology = builder.build();

			final KafkaStreams streams = new KafkaStreams(topology, props);
			final CountDownLatch latch = new CountDownLatch(1);

			// attach shutdown handler to catch control-c
			Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook") {
				@Override
				public void run() {
					streams.close();
					latch.countDown();
				}
			});


			streams.start();
			latch.await();
		} catch (Throwable e) {
			System.exit(1);
		}
		System.exit(0);

	}

}
