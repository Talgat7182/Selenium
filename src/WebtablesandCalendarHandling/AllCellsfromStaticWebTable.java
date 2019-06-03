package WebtablesandCalendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
public class AllCellsfromStaticWebTable extends CommonMethods {
	
	public static void main(String [] args) { 
		
		setUpDriver("chrome","https://the-internet.herokuapp.com"); 
		
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		List<WebElement>allElements = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td")); 
		
		for(WebElement cell: allElements) { 
			
			String cellText = cell.getText();
			System.out.println(cellText);
			
		}

		System.out.println("-------Nested Loop Way---------");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")); 
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")); 
		
		for(int i = 1; i<row.size(); i++) { 
			
			for(int j = 1; j<col.size(); j++) {
				
			String cellText = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+i+"]/td["+j+"]")).getText();
			
			System.out.println(cellText +" ");
			}
		}
		
		driver.quit();
		
		
		
	}

}
