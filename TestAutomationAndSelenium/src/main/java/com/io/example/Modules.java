package com.io.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesEx.readProperties();
		browser=PropertiesEx.prop.getProperty("browser");  //getting the browser from config.properties file
		
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\G Varsha Reddy\\eclipse-workspace\\TestAutomationAndSelenium\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		driver=new ChromeDriver();
		driver.get(PropertiesEx.prop.getProperty("url")); //getting the url from config.properties
	}
	public static void endTest() {
		driver.quit();
	}
}
