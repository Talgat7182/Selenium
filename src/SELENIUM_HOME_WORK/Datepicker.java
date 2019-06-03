package SELENIUM_HOME_WORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Datepicker extends CommonMethods {
	public static void main(String[] args) throws InterruptedException  {

		String url = "http://jqueryui.com/";
		setUpDriver("chrome", url);

		clickOn(driver.findElement(By.linkText("Datepicker")));

		driver.switchTo().frame(0);

		clickOn(driver.findElement(By.cssSelector("input#datepicker")));

		WebElement dateTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));

		while(!dateTitle.getText().contains("August 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			 dateTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		}

		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement cell:cells) { 
			if(cell.getText().equals("27")) { 
				
				cell.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}