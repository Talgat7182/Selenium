package com.SeleniumHomePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("C://Users//talga//Selenium//chromedriver.exe");
		
		WebElement selecttab = driver.findElement(By.id("countriesSingle")); 
		Select select = new Select(selecttab);
		
		List<WebElement>alloptions = select.getOptions(); 
		
		System.out.println("options that are available = "+alloptions.size());
		
		select.selectByVisibleText("United States of America");
		
		WebElement multi = driver.findElement(By.id("countriesMultiple"));
		Select select1 = new Select(multi); 
		
		List<WebElement>options2 = select1.getOptions(); 
		
		System.out.println("options that are available ="+options2.size());
		
		 for(int i = 0; i<options2.size(); i++) { 
			 
			
			
			
			 
		 }
		
	}
}
