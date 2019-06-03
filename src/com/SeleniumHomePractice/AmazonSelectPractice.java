package com.SeleniumHomePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelectPractice {
	
	public static void main(String [] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		WebElement dep = driver.findElement(By.cssSelector("select#searchDropdownBox")); 
		
		Select select = new Select(dep); 
		List<WebElement> depList = select.getOptions(); 
		
		System.out.println("# of department options= "+depList.size());
		
		/*
		 * Iterator<WebElement>it = depList.iterator(); while(it.hasNext()) { String
		 * text = it.next().getText(); System.out.println(text); }
		 */
		
		for(WebElement options:depList) {
			String text = options.getText(); 
			System.out.println(text);
		
		}
		

		
		//Thread.sleep(3000);
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
	
		driver.quit();
	
		
		
		
	}

}
