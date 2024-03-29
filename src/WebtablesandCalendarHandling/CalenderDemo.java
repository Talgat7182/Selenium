package WebtablesandCalendarHandling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class CalenderDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		String url="https://jqueryui.com/datepicker/";
		setUpDriver("chrome", url);
		
		//store frame element and then switch
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		
		//click to bring calendar view
		driver.findElement(By.id("datepicker")).click();
		
		String expectedDate="30";
		
		//get all cells
		List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement cell: cells) {
			//get text of each cell
			String cellText=cell.getText();
			if (cellText.equals(expectedDate)) {
				cell.click();
				System.out.println(cellText);
			}
			
		
		}
		
		Thread.sleep(7000);
		driver.quit();
	}
}


