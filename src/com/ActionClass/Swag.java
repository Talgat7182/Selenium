package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;
public class Swag extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "https://www.saucedemo.com/");
		WebElement rightClick = driver.findElement(By.cssSelector("input#password")); 
		
		Actions action = new Actions(driver); 
		
		action.contextClick(rightClick).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	

}
