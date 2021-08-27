package com.bora.helpers;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class ConfigReader {
	private final String propertyFilePath="src/test/resources/com/bora/config/Config.properties";
	private Properties properties;
	public ConfigReader() {
		try {
			FileInputStream stream =new FileInputStream( propertyFilePath);
			properties =new Properties();
			properties.load(stream);
			stream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			throw new RuntimeException("Property file path not found!");
		}
	}
	
	public String getUrl() {
		String url =properties.getProperty("url");
		if(url!=null) {
			return url;	
		}else {
			throw new RuntimeException("url is not defined in the property file");
		}
	}
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!=null) {
			return driverPath;	
		}else {
			throw new RuntimeException("driverPath is not defined in the property file");
		}
	}
	public long getImplicityWaitTime() {
		String ImplicityWaitTime=properties.getProperty("ImplicityWaitTime");
		if(ImplicityWaitTime!=null) {
			long time =Long.getLong("ImplicityWaitTime") ;	
			return time;
		}else {
			throw new RuntimeException("ImplicityWaitTime is not defined in the property file");
		
		}
	}
	public long getsmallWait() {
		String smallWait = properties.getProperty("smallWait");
		if(smallWait!=null) {
			long time = Long.parseLong(smallWait);
			return time;
		}
		else {
			throw new RuntimeException("smallWait is not defind in config.properties file");
		}
	}
	
	public long getMediumWait() {
		String mediumWait = properties.getProperty("mediumWait");
		if(mediumWait!=null) {
			long time = Long.parseLong(mediumWait);
			return time;
		}
		else {
			throw new RuntimeException("mediumWait is not defind in config.properties file");
		}
	}
	
	public long getLargeWait() {
		String largeWait = properties.getProperty("largeWait");
		if(largeWait!=null) {
			long time = Long.getLong(largeWait);
			return time;
		}
		else {
			throw new RuntimeException("largeWait is not defind in config.properties file");
		}
	}
	public static void main(String[] args) throws IOException {
		Properties propeties =new Properties();
		FileInputStream stream = new FileInputStream("src/test/resources/com/bora/config/Config.properties");
		propeties.load(stream);
		String url =propeties.get("url").toString();
		System.out.println(url);
	}

}
