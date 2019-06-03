package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsCommand {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@data-test,'username')]")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.close(); 
		
		
		
	}
}
