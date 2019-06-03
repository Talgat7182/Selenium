package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods; 
public class DoubleClickTask extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome","https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#password")).sendKeys("IloveBNI");
		
		Actions action = new Actions(driver); 
		action.doubleClick(driver.findElement(By.cssSelector("input#password"))).perform();
		
		Thread.sleep(2000);
		driver.close();
	}

}
