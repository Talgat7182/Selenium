package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DragAndDropTask1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUpDriver("chrome", "https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// first find the frame by using a WebElement
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		// switch to WebElement
		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		/* This is another to drag & drop, but it is lengthy a bit
		 * action.clickAndHold(drag).perform(); 
		 * action.moveToElement(drop).perform();
		 * action.release(drop).perform();
		 */
		Thread.sleep(3000);
		driver.close();

	}

}
