
package WebtablesandCalendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class DynamicWebTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);

		WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'_username')]"));
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'_password')]"));
		sendText(userName, "Tester");
		sendText(pass, "test");
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id,'_login_button')]"));

		clickOn(login);
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr"));

		String client = "Susan McLaren";
		String updatedLastName = "Susan Sulu";
		for (int i = 1; i <= rows.size(); i++) {

			String text = driver.findElement(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr[" + i+ "]"))
					.getText();

			if (text.contains(client)) {

				WebElement click = driver
						.findElement(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr[" + i + "]/td[13]"));
				clickOn(click);
				WebElement change = driver.findElement(By.cssSelector("input[id*='_txtName']"));
				
				sendText(change, "Susan Sulu");

				driver.findElement(By.cssSelector("a[id*='_UpdateButton']")).click();

			}
		}
		// List<WebElement> =
		// driver.findElements(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr/td"));

		for (int j = 2; j <= rows.size(); j++) {
			String updatedTable = driver
					.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + j + "]/td[2]")).getText();

			if (updatedTable.contains(updatedLastName)) {
				System.out.println("Contains updated last name: " + updatedTable);

			}
			
			
		}

		Thread.sleep(3000);

		driver.quit();

	}
}
