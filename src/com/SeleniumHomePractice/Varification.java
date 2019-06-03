package com.SeleniumHomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Varification {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		String userName="standard_user";
		String password = "secret_sauce";
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'User')]")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@data-test,'pass')]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[starts-with(@class,'btn')]")).click(); 
		
		boolean displayCheck = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
		if(displayCheck) { 
			
			System.out.println("Robut is displayed");
		}
		else { 
			System.out.println("Robut dislay failed");
		}
		
		WebElement product = driver.findElement(By.cssSelector("div.product_label")); 
		
	
		String productText =product.getText();
		boolean displayP = product.isDisplayed(); 
		String expectedValue ="Products"; 
		
		if(displayP && productText.equals(expectedValue)){ 
			System.out.println("Product is displayed and the text is "+productText);
			
			
		}
		else { 
			System.out.println("Product is not displayed and the text is "+productText);
		}
		
		driver.quit();
		
	}
	

}


