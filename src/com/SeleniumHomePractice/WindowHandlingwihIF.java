package com.SeleniumHomePractice;

import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class WindowHandlingwihIF extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");

		String parent = driver.getWindowHandle();

		System.out.println("parent id: " + parent);

		driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
		Thread.sleep(3000);

		Set<String> allWindows = driver.getWindowHandles();

		for (String child : allWindows) {

			if (!parent.equals(child)) {

			    driver.switchTo().window(child);
               child = driver.getWindowHandle();
               System.out.println("child ID: "+child);
		
			}

		}
driver.quit();
Thread.sleep(3000);
	}

}
