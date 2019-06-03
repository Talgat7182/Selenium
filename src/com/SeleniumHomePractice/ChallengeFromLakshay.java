package com.SeleniumHomePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengeFromLakshay {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement>rbutton= driver.findElements(By.cssSelector("input[name='sex']"));
		boolean value=false;
		
		value =rbutton.get(0).isSelected(); 
		
		if(value==true) {
			
	 rbutton.get(0).click();
	 Thread.sleep(3000);
		}
		else { 
			rbutton.get(1).click();
		
		Thread.sleep(3000);
	}
		driver.quit();
	}
}
