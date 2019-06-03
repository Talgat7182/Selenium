package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertHandling {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrom.driver","C://Users//talga//Selenium//chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Switch to")).click();
		driver.findElement(By.id("alert")).click(); 
		// if we do not handle alert, we will get unhandledalertexception
		//driver.findElement(By.id("confirm").click();
		// switch focus to the laert window 
		Alert alert =driver.switchTo().alert();
		alert.accept(); 
		driver.findElement(By.id("confirm")).click(); 
		Alert confirmAlert = driver.switchTo().alert();
		String alertText = confirmAlert.getText(); 
		System.out.println(alertText);
		confirmAlert.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Alert alertPrompt = driver.switchTo().alert(); 
		
		System.out.println(alertPrompt.getText());
		
		alertPrompt.getText();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
