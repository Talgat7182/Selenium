package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VKLogin {
	
	public static void main(String [] args) { 
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vk.com"); 
		
		driver.findElement(By.xpath("//input[contains(@id,'index_email')]")).sendKeys("mahabaev@list.ru"); 
		
		driver.findElement(By.xpath("//input[starts-with(@id,'index_pass')]")).sendKeys("italy7");
		
		driver.findElement(By.xpath("//button[@id='index_login_button']")).click();
		//driver.close();
		
		
	}

}
