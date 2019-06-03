package com.passingdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameBlog {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		driver.get(" https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("iframe1");
	WebElement el = driver.findElement(By.xpath("//a[@title='Git Log']"));
	if(el.isDisplayed()) {
		
		el.click();
		Thread.sleep(3000);
	}
	}

}
