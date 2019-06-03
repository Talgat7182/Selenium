package com.SeleniumHomePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTaskRecap {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		String expectedText = "I am an alert box!";
		if (alertText.contains(expectedText)) {

			System.out.println("Simple alert text " + alertText + " on the website mathches expected text, which is "
					+ expectedText);
			
			simpleAlert.accept();
			Thread.sleep(3000);
		}
			
			else { System.out.println("Actual text of simple alert doesn't match the expected text");
			}
			
		
			driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
			Alert confirmAlert = driver.switchTo().alert(); 
			String confirmText = confirmAlert.getText(); 
			String confirmExpectedText ="Press a button!";
			
			if(confirmText.contains(confirmExpectedText)) {
				System.out.println("Confirmation text passed, actual and expected text match");
				Thread.sleep(3000);
				confirmAlert.accept();
				
			}
			
			else { 
				System.out.println("They do not match, needs to be fixed");
			}
			
			
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptText = promptAlert.getText(); 
		String expectedAlertText = "Please enter your name"; 
		
		if(promptText.contains(expectedAlertText)) {
			System.out.println("Pass");
			
			promptAlert.sendKeys("Leonardo Da Vinci");
			Thread.sleep(3000);
			promptAlert.accept(); 
		}
		else { 
			System.out.println("Prompt expected text and actual text do not match");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
