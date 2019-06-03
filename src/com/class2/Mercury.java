package com.class2;

// explanation 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	
	public static void main(String[] args) throws InterruptedException {
		// explanation 
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// or driver.get(""http://newtours.demoaut.com/") 
		// either is fine get() or navigate()
		
		driver.navigate().to("http://newtours.demoaut.com/"); 
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click(); // cause it has a tag 
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("704734444");
		driver.findElement(By.id("userName")).sendKeys("sala@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("122 sunny ct");
		driver.findElement(By.name("city")).sendKeys("Chantilly"); 
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("20190");
		driver.findElement(By.name("country")).sendKeys("Argentina");
		driver.findElement(By.id("email")).sendKeys("JJJ");
		driver.findElement(By.name("password")).sendKeys("Reston1427");
		driver.findElement(By.name("confirmPassword")).sendKeys("Reston1427");
		driver.findElement(By.name("register")).click();
		driver.close();
		
				
		
		
		
	}
}
