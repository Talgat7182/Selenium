package com.DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Total number of links are "+links.size());
		int count = 0; 
		
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext()) { 
		// we use.getText(); when we iterating through iterator 
		String linkText = it.next().getText();
	
		if(!linkText.isEmpty()) {
			System.out.println(linkText);
			count++; 
		}
			
			
		}
		System.out.println("total number of links with text are "+ count);
		driver.quit();
		
	}

}
