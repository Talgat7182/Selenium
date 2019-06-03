package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navatgation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//
		driver.navigate().to("http://www.costco.com"); // full url
		Thread.sleep(3000);
        driver.navigate().to("http://google.com");// not full
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
	}
}