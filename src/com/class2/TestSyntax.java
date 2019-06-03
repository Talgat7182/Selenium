package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSyntax {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.syntaxtechs.com");
		Thread.sleep(3000);
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		String url = driver.getTitle();
		if (url.contains("Syntax")) {
			System.out.println("it contains it");

		}

		else {
			System.out.println("it does not contain it");

		}
	}
}
