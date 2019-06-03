package com.SeleniumHomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid {
	
	public static void main(String [] args) { 
		
		System.setProperty("webdriver.chrome.driver",  "C://Users//talga//Selenium//chromedriver.exe"); 
		String userName="sam";
		String password = "ilovetesting";
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.cssSelector("input[type^='te']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[data-test$='ord']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input[value*='LOG']")).click();
		
		WebElement message = driver.findElement(By.cssSelector("h3[data-test*='error']"));
		String actualMessage = message.getText(); 
		String expectedMessage = "Username and password do not match any user in this service"; 
		
		if(actualMessage.contains(expectedMessage)) {
			System.out.println("The message for invalid user name and password passed");
		}
		
		else { System.out.println("It did not pass, the message is "+actualMessage);
	}

}
	}
