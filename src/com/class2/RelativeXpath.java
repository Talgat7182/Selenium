package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // interface 
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
