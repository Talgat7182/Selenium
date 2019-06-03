package JavaScriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

//TC 12356 - search verification 
//Step 1 : navigate to URL
//Step 2 : enter details
//Step 3 : verify search is successful 
//Step 4 : quit the website

public class FlightSearch extends CommonMethods {

	String browser = "chrome";
	String url = "https://www.aa.com/homePage.do";

	@BeforeMethod

	public void setUp() {
		setUpDriver(browser, url);
	}

	@Test
	public void searchFlight() throws InterruptedException {

		sendText(driver.findElement(By.name("originAirport")), "DCA");
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();

		// WebElement depMonth =
		// driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));

		WebElement depNext = driver.findElement(By.xpath("//a[@title='Next']"));
		WebElement depTitle = driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div"));
		System.out.println(depTitle);

		while (!depTitle.getText().contains("October")) {
			depNext.click();

			depTitle = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));

		}
		List<WebElement> cells = driver
				.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));

		for (WebElement cell : cells) {

			if (cell.getText().equals("11")) {

				cell.click();
				break;
			}
		}

	}

	@AfterMethod

	public void tearDown() {

		// driver.quit();
	}
}
