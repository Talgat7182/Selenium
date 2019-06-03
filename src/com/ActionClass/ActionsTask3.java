package com.ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class ActionsTask3  extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
		
		Actions simpleAction = new Actions(driver);
		simpleAction.click(driver.findElement(By.cssSelector("button[name='click']"))).perform();
		Alert simpleAlert = driver.switchTo().alert(); 
		simpleAlert.accept();
		
		//driver.findElement(By.cssSelector("button[name='dblClick']")).click();
	
		Actions action = new Actions(driver); 
		action.doubleClick(driver.findElement(By.cssSelector("button[name='dblClick']"))).perform();
		Alert doubleAlert = driver.switchTo().alert();
		doubleAlert.accept();
		
		Thread.sleep(3000);
		driver.close();
	}

}
