package JavaScriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
public class FlighSearch1  extends CommonMethods{

	String browser="chrome";
	String url="https://www.aa.com/homePage.do";
	
	@BeforeMethod
	public void setUp() {
		setUpDriver(browser, url);
	}
	
	@Test
	public void searchFlight() throws InterruptedException {
		//enter to and from
		sendText(driver.findElement(By.name("originAirport")), "DCA");
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		//click on calendar icon
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
		//grab element that holds month & year
		WebElement depMonth=driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
	
		while(!depMonth.getText().contains("October")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			//if we wont perform this action we will get
			//StaleElementReferenceException: stale element reference: element is not attached to the page document
			depMonth=driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		}
		//capturing all cell and then loop and search for specific date
		List <WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for(WebElement cell: depCells) {
			if(cell.getText().equals("18")) {
				cell.click();
				break;
			}
		}
	//select arrival as December 24
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
