package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
	
	public static void main(String [] args) throws InterruptedException { 
		
		
		System.setProperty("webdriver.driver.chrome", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
	
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/"); 
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		
		//driver.findElement(By.LinkText("Link Test")).click();
		
	}

}
