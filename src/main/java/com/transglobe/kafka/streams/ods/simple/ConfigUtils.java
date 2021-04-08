package com.transglobe.kafka.streams.ods.simple;

import java.io.InputStream;
import java.util.Properties;


public class ConfigUtils {

	
	public static Properties getProperties(String fileName) throws Exception {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		Properties prop = new Properties();
		try (InputStream input = loader.getResourceAsStream(fileName)) {
			if (input == null) {
				throw new IllegalArgumentException("Cannot find file:" + fileName);
			}
			
			// load a properties file
			prop.load(input);

			return prop;
		} catch (Exception ex) {
			throw ex;

		} 
		
	}
}
