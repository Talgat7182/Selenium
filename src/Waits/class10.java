package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class class10 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		String text = "Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		String buttonXpath = "//button[text()='Enable']";

		driver.findElement(By.xpath(buttonXpath)).click();

		// 1 way
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		String enterText = "hello";

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(enterText);
		String returnText = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		if (returnText.equals(enterText)) {

			System.out.println("Text is enabled");
		}

		else {
			System.out.println("Text is not enabled");
		}

		// 2nd way to do it
		/*
		 * WebElement el = driver.findElement(By.xpath("//input[@type='text']"));
		 * WebDriverWait wait = new WebDriverWait(driver,30);
		 * wait.until(ExpectedConditions.elementToBeClickable(el));
		 * 
		 * String texttoEnter ="hi"; el.sendKeys(texttoEnter);
		 * 
		 * String value = el.getAttribute("value"); System.out.println(value);
		 */

		Thread.sleep(3000);
		driver.quit();
	}
}
