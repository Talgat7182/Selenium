package com.DropDown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotValidUserPass {

	

		public static String message = "Username and password do not match any user in this service";
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		//	driver.manage().window().maximize();
		
	 driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard-user");
	 driver.findElement(By.cssSelector("input#password")).sendKeys("secret-sauce");
	 driver.findElement(By.cssSelector("input.btn_action")).click();
	
		/*
		 * boolean isDisplayedRob =
		 * driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		 * if(isDisplayedRob) { System.out.println("Robut icon Pass"); }
		 * 
		 * else { System.out.println("Robout icon did not pass"); }
		 */
	 
	 WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
	 String detect = error.getText(); 
	 // we can do it like in the previous class with String expected and do contain 	 
	 if(detect.contains(message)) { 
		 System.out.println("Error verified");
	 }
	 
	 else { 
		 System.out.println("Error not verified");
	 }
	 
			
	 
			
		//	Thread.sleep(5000);
		//	driver.quit();
			
		}
	}


