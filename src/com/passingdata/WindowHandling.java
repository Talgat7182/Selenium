package com.passingdata;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		
		String parentID = driver.getWindowHandle();
		String parentTitle = driver.getTitle();
		
		System.out.println("Parent ID: "+parentID +" Parent title: "+parentTitle);
		
		
		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		//driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		
		
		Set<String>childWindow = driver.getWindowHandles();
		
		
		Iterator<String> it = childWindow.iterator();		
		
	   while(it.hasNext()) {
		  parentTitle=it.next();
		  String child = it.next();
		  driver.switchTo().window(child);
		  // to get title we just do getTitle();
		  child = driver.getTitle();
		 // to get an id, we need get.WindowHandle
		  
		  String childID= driver.getWindowHandle();
		  
		  System.out.println("child id: "+childID+ " child title: "+child);
		  
		  
		
	}
		driver.quit();
		
	}

}
