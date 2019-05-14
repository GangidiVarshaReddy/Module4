package com.io.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\G Varsha Reddy\\eclipse-workspace\\TestAutomationAndSelenium\\src\\main\\java\\config.properties");
			prop.load(is);  //getting the location from config.properties
			System.out.println(prop.getProperty("browser"));  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
