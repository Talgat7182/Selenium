package WebtablesandCalendarHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class SpecificRowandCol extends CommonMethods {

	public static void main(String[] args) {

		setUpDriver("chrome", "https://the-internet.herokuapp.com/tables");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));

		System.out.println("Printing 3rd row");

		for (int colNum = 1; colNum <= cols.size(); colNum++) {

			String thirdRow = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[3]/td[" + colNum + "]"))
					.getText();
			System.out.println("3rd row texts are " + thirdRow);
		}

		System.out.println("Printing 4th column");

		for (int rowNum = 1; rowNum <= rows.size(); rowNum++) {
			String fourthCol = driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[" + rowNum + "]/td[4]"))
					.getText();
			System.out.println("4th column texts are " + fourthCol);
		}

		driver.quit();
	}

}
