package com.SeleniumHomePractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoDropDD {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("hb "); 
		driver.findElement(By.linkText("Select")).click();
		
		WebElement firstDD = driver.findElement(By.cssSelector("select#countriesSingle")); 
		Select select = new Select(firstDD);
		
		List<WebElement>optionList = select.getOptions();
	    System.out.println("# of options available in the firstDD= "+optionList.size());
	    
	    select.selectByVisibleText("United states of America");
	    Thread.sleep(3000);
		
		
	    WebElement secondDD = driver.findElement(By.id("countriesMultiple"));
	    Select select1 = new Select(secondDD); 
	    
	    List<WebElement>MultiListoptions = select1.getOptions();
	    
	    System.out.println("# of options in the secondDD= "+MultiListoptions.size());
	    
	    // to select all by using for loop 
	   for(int i = 0; i<MultiListoptions.size(); i++) { 
		   
		   select1.selectByIndex(i);
		   //Thread.sleep(2000);
	   }
	  // select1.deselectByVisibleText("China");
	   for(WebElement countryOptions:MultiListoptions) {
		   
		  countryOptions.click();
		  Thread.sleep(2000);
	   }
	   
	   
	   Thread.sleep(3000);
	   driver.quit();
	}
}
