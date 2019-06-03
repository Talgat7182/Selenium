package com.ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Numbers extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Index");

		driver.findElement(By.xpath("//a[text()='Actions']")).click();

		List<WebElement> numbers = driver.findElements(By.cssSelector("li[class^='ui']"));

		Actions action = new Actions(driver);
		int i = 0;
		for (WebElement number : numbers) {
			i++;

			action.moveToElement(number).clickAndHold().perform();

			if (i == 4) {
				break;

			}
			Thread.sleep(3000);
			driver.close();
		}
	}

}
