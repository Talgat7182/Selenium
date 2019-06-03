package WebtablesandCalendarHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class PracticeStaticWebTable extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUpDriver("chrome", "https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Sortable Data Tables")).click();

		List<WebElement> rowsSize = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		List<WebElement> colSize = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

		int expectedSizeOfRows = 4;
		int actualSizeOfRows = rowsSize.size();

		int expectedSizeOfCols = 6;
		int actualSizeofCols = colSize.size();

		System.out.println("Actual size of rows =" + actualSizeOfRows);

		if (actualSizeOfRows == expectedSizeOfRows) {
			System.out.println("Actual size of rows matches the expected one");
			System.out.println("--------Row texts------");
			for (WebElement row : rowsSize) {
				String rowText = row.getText();
				System.out.println(rowText + " ");
			}
		} else {
			System.out.println("Actuals size of rows doesn't match expected one");
		}

		System.out.println("-----------Columns Verification----------------");
		System.out.println("Actual size of rows =" + actualSizeofCols);
		if (actualSizeofCols == expectedSizeOfCols) {
			System.out.println("Actual and Expected size of columns match");

			System.out.println("-----Headers------");
			Iterator<WebElement>it = colSize.iterator();
			while(it.hasNext()) { 
				
				String colText = it.next().getText();
				System.out.println(colText);
			}
			
			
			System.out.println("Actual and Expected size of coulumns don't match");
		}

		Thread.sleep(3000);

		driver.quit();
	}
}
