package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://amazon.com"); 
	System.out.println(driver.getTitle());
	String title = driver.getTitle(); 
	String actual = title;
	String expected = "Online Shopping for Electronics,Apparel,Computers,Books,DVD & more";
	if(expected.equalsIgnoreCase(actual)) {
		System.out.println("this is the right title");
	}
	
	else { System.out.println("sorry this is not the right title");
	
	

}

	}
}