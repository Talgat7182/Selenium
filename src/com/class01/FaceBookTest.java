package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	   System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.vk.com");
		Thread.sleep(2000);
		driver.findElement(By.id("index_email")).sendKeys("mahabaev@list.ru");
		Thread.sleep(2000);
		driver.findElement(By.id("index_pass")).sendKeys("italy7");
		Thread.sleep(2000);
		driver.findElement(By.id("index_login_button")).click();
		
	 //    driver.findElements(By.id("top_logout_link")).click();
		
		

}
}