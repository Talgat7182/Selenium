package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		// title

		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {

			System.out.println("this is the right title");
		} else {
			System.out.println("sorry this is not the title");
		}

		// WebDriver driver = new ChromeDriver();
		// i don't need to create driver1 or title1, i can use the same object and
		// variable name
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		title = driver.getTitle();
		if (title.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("this is the right title");
		} else {
			System.out.println("sorry this is not the title");
		}
// driver.close(); and driver.quit();
		
		
	}

}