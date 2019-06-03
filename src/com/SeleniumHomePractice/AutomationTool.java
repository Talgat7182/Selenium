package com.SeleniumHomePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTool {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe"); 
		
	WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String valueToSelect = "Selenium Webdriver";

		List<WebElement>tools = driver.findElements(By.name("tool")); 
		
     for(WebElement val:tools) { 
    	 if(val.isEnabled()) { 
    		 
    		String value = val.getAttribute("value");
    		Thread.sleep(1000);
    		//val.click();
    		 
    		 System.out.println(value);
    		 
    		 if(value.contains(valueToSelect)) {
    			 Thread.sleep(3000);
    			 val.click();
    		 }
    	   	 }
    	 
    	 
     
     }
     driver.quit();
	}
	}


