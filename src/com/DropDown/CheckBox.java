package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String valueToSelect = "Selenium WebDriver";

		List<WebElement> experience = driver.findElements(By.name("exp")); // use Xpath for recoding 
		

		System.out.println(experience.size());

		for (WebElement list : experience) {

			if (list.isEnabled()) {
		Thread.sleep(2000);
					 
					// System.out.println(list.getAttribute("value") + " is clickable");
		list.click();
			}
			

			//else { 
				//System.out.println(list.getAttribute("value") + " is not clickable");
			//}

		}
		
		List<WebElement>select = driver.findElements(By.xpath("//input[@name='tool']"));

		String choose = "Selenium Webdriver";
		
		Thread.sleep(2000);
		for(WebElement selectclick:select) { 
			
			if(selectclick.isEnabled()) {
				
				if(selectclick.equals(choose)) { 
					Thread.sleep(2000);
					selectclick.click();
				}

			}
		}

			
		
		
		driver.quit();
	}
}
