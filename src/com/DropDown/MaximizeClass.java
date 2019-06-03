package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeClass {

	public static String productName = "Products";
	public static void main(String[] args) throws InterruptedException {
		// i can create my string variable and use it in sendkeys, instead of hardcoding 
		// string name = "standar_user"; 
		// String password ="secrect_sauce"; 
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	
 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user"); //could store it and pass it ( above ) 
 driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
 driver.findElement(By.cssSelector("input.btn_action")).click();
 
 boolean isDisplayedRob = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
 if(isDisplayedRob) { 
	 System.out.println("Robut icon Pass"); }
 
 else { 
	 System.out.println("Robout icon did not pass");
 }
 
 WebElement product = driver.findElement(By.cssSelector("div.product_label"));
 
 String value = product.getText(); 
 // String expectedText ="Products";
 // if(displayP && productext.equals(expectedText))
 // we can also do it this way 
 if(value.equals(productName)) { 
	 System.out.println("Product text Pass");
 }
 
 else { 
	 System.out.println("Product text did not pass");
 }
 
		
 
		
	//	Thread.sleep(5000);
	//	driver.quit();
		
	}
}
