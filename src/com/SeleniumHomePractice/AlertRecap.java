package com.SeleniumHomePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertRecap {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://uitestpractice.com/");

		driver.findElement(By.xpath("//a[text()='Switch to']")).click();
		driver.findElement(By.cssSelector("button#alert")).click();

		Thread.sleep(3000);

		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println("Text of the simple alert is " + simpleAlertText);
		simpleAlert.accept();

		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmText = confirmAlert.getText();
		System.out.println("Text of the confirm alert is " + confirmText);

		confirmAlert.dismiss();
		
		driver.findElement(By.cssSelector("button#prompt")).click();
		
         Alert promptAlert = driver.switchTo().alert();
         String promptText = promptAlert.getText(); 
         System.out.println("Text of prompt alert is "+promptText);
         Thread.sleep(3000);
         promptAlert.sendKeys("Japan ");

         promptAlert.accept();
         Thread.sleep(3000);
         driver.quit();

	}
}
