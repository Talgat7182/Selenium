package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// key for chrome browser;
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C://Users//talga//Selenium//chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("http://google.com"); driver.get("http://facebook.com");
		 */
        
		System.setProperty("webdriver.gecko.driver","C://Users//talga//Selenium//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:google.com");
	
	
	}
}
