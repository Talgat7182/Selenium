package com.SeleniumHomePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com/");
		WebElement dept = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(dept);

		List<WebElement> alloptions = select.getOptions();
		System.out.println("all options that are available are " + alloptions.size());
		for (WebElement option : alloptions) {
			System.out.println(option.getText());
		}
	
		if (select.isMultiple()) {

			select.selectByVisibleText("Computers");
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
