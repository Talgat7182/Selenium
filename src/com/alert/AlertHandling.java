package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
	//	driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		
		if(alertText.contains("I am an alert box")) {
			System.out.println("Pass");
		}
		
	//	alert.accept();
		Thread.sleep(2000);

	}
}
