package com.transglobe.kafka.streams.ods.simple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestJson {
	static final Logger logger = LoggerFactory.getLogger(TestJson.class);
	
	public static void main(String[] args)  {
		
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test() throws Exception {
		Properties prop = ConfigUtils.getProperties("config.properties");
	    String sinkTable = prop.getProperty("sink.table");
	    String sinkSegOwner = sinkTable.split("\\.")[0];
	    String sinkTableName = sinkTable.split("\\.")[1];
	    logger.warn(" sinkTable={}", sinkTable);
	    logger.warn("sinkSegOwner={}, sinkTableName={}", sinkSegOwner, sinkTableName);
		
		Path path = Paths.get("/home/oracle/gitrepository/kafka-streams-ods/src/main/resources/testjson.txt");

	    String json = Files.readAllLines(path).get(0);
	    logger.warn("json={}", json);
	    
	    
	    ObjectMapper objectMapper = new ObjectMapper();
	    JsonNode jsonNode = objectMapper.readTree(json);
	    System.out.println("jsonNode:" + jsonNode);
	    
	    System.out.println("schema:" + jsonNode.get("schema"));
	    System.out.println("payload:" + jsonNode.get("payload"));

	    System.out.println("SEG_OWNER:" + jsonNode.get("payload").get("SEG_OWNER").asText());
	    System.out.println("TABLE_NAME:" + jsonNode.get("payload").get("TABLE_NAME").asText());
	    System.out.println("SQL_REDO:" + jsonNode.get("payload").get("SQL_REDO").asText());
	    String redoStr = jsonNode.get("payload").get("SQL_REDO").asText();
	    String sourceSegOwner = jsonNode.get("payload").get("SEG_OWNER").asText();
	    String sourceTableName = jsonNode.get("payload").get("TABLE_NAME").asText();
	    String sourceSchemaStr = String.format("\"%s\".\"%s\"", sourceSegOwner, sourceTableName);
	    String afterSchemaStr = String.format("\"%s\".\"%s\"", sinkTable.split("\\.")[0], sinkTable.split("\\.")[1]);
	    logger.warn("after repacestr:" + redoStr.replace(sourceSchemaStr, afterSchemaStr));
	    ObjectNode on = (ObjectNode)jsonNode.get("payload");
	    on.put("SEG_OWNER", sinkSegOwner);
	    on.put("TABLE_NAME", sinkTableName);
	    on.put("SQL_REDO", redoStr.replace(sourceSchemaStr, afterSchemaStr));
	    logger.warn("after schema str={}", jsonNode);
	    
//	    
//	    redoStr.re

	}

}
