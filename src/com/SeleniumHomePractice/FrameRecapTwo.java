package com.SeleniumHomePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class FrameRecapTwo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");

		driver.switchTo().frame("iframe1");
// i can do it with boolean, if want to click it later. becaue boolean doesn't have the displayed or enabled methods

		WebElement el = driver.findElement(By.xpath("//a[text()='How to Set up Protractor?']"));

		if (el.isDisplayed()) {

			System.out.println("How to set up Protractor is displayed");
			el.click();
			Thread.sleep(3000);

		}

		else {
			System.out.println(el + " is not displayed");
		}

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.switchTo().frame("iframe2");
		WebElement text = driver.findElement(By.xpath("//h3[@class='widget-title']"));
		if (text.isDisplayed()) {

			System.out.println("if " + text.getText() + " matches Interactions, then pass");

			
		} else {
			System.out.println("it doesn't match");
		}

		driver.switchTo().defaultContent();
		driver.quit();

	}

}
