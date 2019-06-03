package com.SeleniumHomePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weqas {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement>list = driver.findElements(By.xpath("//input[@name='tool']"));
		
		for(WebElement tools:list) {
			if(tools.isEnabled()) {
			
			tools.click();
		}
		}
		Thread.sleep(3000);
		List<WebElement>list2 = driver.findElements(By.cssSelector("input[id^='tool-']")); 
		
		Iterator<WebElement> autoTools = list2.iterator(); 	
		while(autoTools.hasNext()) { 
			autoTools.next().click();
			
		}
		
	
		Thread.sleep(3000);
		
		List<WebElement>list3 = driver.findElements(By.xpath("//input[@name='tool']"));
		String selectVal = "QTP";
		for(WebElement select : list3) { 
			
			String val= select.getAttribute("value"); 
			
			if(val.equals(selectVal)) {
				
				select.click();
			}
			
		}
		Thread.sleep(3000);
	      driver.close();
	}
	

}
