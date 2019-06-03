package com.SeleniumHomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

class MultipleWindowsTestCasefromCanvas extends CommonMethods {

	// create global values 
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		String parentID = driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		if (title.equalsIgnoreCase("Elemental Selenium")) {

			System.out.println("Actual title matches expected title");
			Thread.sleep(2000);
		} else {
			System.out.println("Actual & expected do not match");
		}

		
	}

}
