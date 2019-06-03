package com.SeleniumHomePractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class WindowHandles extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");

		String parentTitle = driver.getTitle();
		String parentID = driver.getWindowHandle();

		System.out.println("parent title is " + parentTitle + " parent ID is " + parentID);
		// System.out.println("parent ID is " + parentID);

		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Thread.sleep(3000);

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		while (it.hasNext()) {
			// parentID = it.next();
			parentTitle = it.next();
			String childTitle = it.next();
			// String childID = it.next();
			driver.switchTo().window(childTitle);
			// driver.switchTo().window(childID);
			childTitle = driver.getTitle();
			String childID = driver.getWindowHandle();  
			

			System.out.println("title of child is " + childTitle + " child ID " + childID);

			driver.switchTo().window(parentTitle);

			Thread.sleep(3000);

		}

		driver.quit();

	}

}
