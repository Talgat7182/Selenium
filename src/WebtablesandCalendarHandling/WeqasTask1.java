package WebtablesandCalendarHandling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
public class WeqasTask1 extends CommonMethods{
	
	public static void main(String[] args) throws InterruptedException {
		
		String url ="https://the-internet.herokuapp.com/tables";
		setUpDriver("chrome",url);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")); 
		String client = "Doe"; 
		
		for(int i = 1; i< rows.size(); i++) { 
			
			String text = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]")).getText(); 
			
			if(text.equals(client)) {
				
				
				driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td[6]")).click();
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
