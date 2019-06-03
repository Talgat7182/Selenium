package WebtablesandCalendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TableTask1 extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		setUpDriver("chrome","https://the-internet.herokuapp.com/"); 
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")); 
	
	int sizeofRows = rows.size();
	int expectedRows =4;
	
		System.out.println("number of rows ="+sizeofRows);
		
		if(sizeofRows==expectedRows) { 
			System.out.println("Pass: [we have 4 rows, which mathces the expected result]");
		}
		
		else { System.out.println("Failed: [it doesn't match the expected number of rows]");
		}
		Thread.sleep(3000); 
		
		driver.quit();
		}
	}


