package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
	driver.findElement(By.id("customer.firstName")).sendKeys("bob");
	driver.findElement(By.name("customer.lastName")).sendKeys("tomson");
	driver.findElement(By.id("customer.address.street")).sendKeys("1222 Leesburg");
	driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("20190");
	driver.findElement(By.id("customer.phoneNumber")).sendKeys("7038142155");
	driver.findElement(By.id("customer.ssn")).sendKeys("7088123434");
	driver.findElement(By.id("customer.username")).sendKeys("John");
	driver.findElement(By.id("customer.password")).sendKeys("Yn3232n_38");
	driver.findElement(By.id("repeatedPassword")).sendKeys("Yn3232n_38");
	driver.findElement(By.className("button")).click();
	driver.quit();
	
}
}