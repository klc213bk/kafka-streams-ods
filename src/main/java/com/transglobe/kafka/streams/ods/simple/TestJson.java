package com.transglobe.kafka.streams.ods.simple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.update.Update;

public class TestJson {
	static final Logger logger = LoggerFactory.getLogger(TestJson.class);

	public static void main(String[] args)  {

		try {
			//	test();
			parseUpdate();
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
	
	public static void parseUpdate() throws JSQLParserException {
		String sql = "Update T_PRODUCTON_DETAIL SET ORDER_ID = 2, PRODUCT_ID='sss' where detail_id = 23456";
		Statement statement = CCJSqlParserUtil.parse(sql);
		Update update = (Update) statement;

		// parse table name
		List<net.sf.jsqlparser.schema.Table> tables = update.getTables();
		String tableName = tables.get(0).getName();
		System.out.println("tableName:" + tableName);
		// table.setTableName(tableName);

		// parse cloumns
		List<Column> columns = update.getColumns();
		List<Expression> expressions = update.getExpressions();
		int size = expressions.size();
		String[] values = new String[size];
		for (int i = 0; i < size; i++) {
			values[i] = expressions.get(i).toString();
			System.out.println("value i:" + values[i]);
		}
		for (int i = 0; i < columns.size(); i++) {
			// entry.put(trimQuotes(columns.get(i).toString()), trimQuotes(values[i]));
			System.out.println("columns i:" + columns.get(i));
		}
		Expression where = update.getWhere();
		System.out.println("where :" + where.toString());
		
		//	    
		//	    // parse where clause
		//	    Expression where = update.getWhere();
		//	    if (where != null) {
		//	        BinaryExpression expr2 = (BinaryExpression) (where);
		//	        handleExpression(condition, expr2);
		//	    }
		//	    Limit limit = update.getLimit();
		//	    parseLimit(condition, limit);
	}
}
