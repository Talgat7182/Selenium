package com.passingdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		driver.switchTo().frame("iframe_a"); 
		
		
		//WebElement el = driver.findElement(By.xpath("//input[@type='text']"));
		//driver.switchTo().frame(el);
		//driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Talgat");
		Thread.sleep(3000);
		
		driver.quit();
		
		//driver.switchTo(0).frame(driver.findElement(By.ccsSelector
		//driver.switchTo().defaultContent(); ---go back to the intitial page
		
		
		
	}
}
