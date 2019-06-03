package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TaskWait extends CommonMethods {
	
	public static void main(String[] args) {
		
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
	   driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();
	   driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
	   
	   driver.findElement(By.xpath("//button[text()='Start']")).click();
	   
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
	   // by.cssSelector(
	   
	   WebElement el = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	   if(el.isDisplayed()) { 
		   String text = el.getText();
		   System.out.println(text);
		   
	   }
	   
	   
	   else { 
		   System.out.println("element is not displayed");
	   }
	   
	   driver.quit();
	}

}
