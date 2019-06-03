package com.DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecet {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement countriesDD = driver.findElement(By.cssSelector("select#contitnets"));
		Select select = new Select(countriesDD); 		
		select.selectByVisibleText("Africa");
		Thread.sleep(3000);
		select.selectByIndex(5);
		
		
	}
	// select1.isMultiple(); 
	
	//List<WebElement>allOptions = select.getOptions(); 
	
 }

