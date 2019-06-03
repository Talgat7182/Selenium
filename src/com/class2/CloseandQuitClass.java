package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitClass {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://cnn.com");
	driver.get("http://bbc.com");
	driver.quit();
	// driver.close();
	
	
	
	
	
}
}