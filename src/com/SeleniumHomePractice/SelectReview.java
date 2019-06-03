package com.SeleniumHomePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectReview {

	public static void main(String[] args) throws InterruptedException {
// 1 st
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
// 2nd
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
// 3rd		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
//4th		
		WebElement continentDD = driver.findElement(By.cssSelector("select#continents"));
//5th	
		Select select = new Select(continentDD);
//6th
		List<WebElement> DDoptions = select.getOptions();

		System.out.println("# of available options in the country drop down= " + DDoptions.size());

		// print all options with text by using Iterator
		Iterator<WebElement> options = DDoptions.iterator();
		while (options.hasNext()) {

			String TextOfOptions = options.next().getText();

			System.out.println(TextOfOptions);
			//Thread.sleep(3000);
		}
		// print some options by using Select functions 
		select.selectByVisibleText("Europe");
		select.selectByIndex(1);
		Thread.sleep(3000);
		
		// multi select example
		
		WebElement commandDD= driver.findElement(By.cssSelector("select#selenium_commands")); 
		Select select1 = new Select(commandDD); 
		List<WebElement>commandSize = select1.getOptions(); 
		System.out.println("# of available commands= "+commandSize);
		// print all options with text by using for loop
		
		for(int i = 0; i<commandSize.size();i++) {
			String commandOptions = commandSize.get(i).getText();
			System.out.println("Options of commands are "+commandOptions);
		}
		if(select1.isMultiple()) { 
			select1.selectByVisibleText("Navigation Commands");
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			Thread.sleep(3000);
			
		}
		//Deselecting options from Multiple Select
		select1.deselectByVisibleText("Navigation Commands");
		Thread.sleep(3000);
		select1.deselectByIndex(2);
		select1.deselectByIndex(3);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
