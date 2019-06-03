package SELENIUM_HOME_WORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class OrderRequest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String URL = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", URL);

		WebElement userName = driver.findElement(By.cssSelector("input[id*='_username']"));
		String name = "Tester";
		sendText(userName, name);
		WebElement pwd = driver.findElement(By.cssSelector("input[id*='_password']"));
		String pathword = "test";
		sendText(pwd, pathword);

		WebElement login = driver.findElement(By.cssSelector("input[id*='_login']"));
		clickOn(login);

		clickOn(driver.findElement(By.linkText("Order")));

		WebElement productDD = driver.findElement(By.xpath("//select[contains(@id,'_ddlProduct')]"));
		String pickPR = "MyMoney";
		selectValueFromDD1(productDD, pickPR);
		/*
		 * WebElement quantity =
		 * driver.findElement(By.cssSelector("input[id*='txtQuantity']")); String
		 * num_Quant = "10"; sendText(quantity, num_Quant);
		 */

		WebElement el = driver.findElement(By.cssSelector("input[id*='txtQuantity']"));
		String num = "27";
		sendText(el, num);

		// quantity.sendKeys("100");

		/*
		 * WebElement price
		 * =driver.findElement(By.cssSelector("input[id*='_txtUnitPrice']")); String
		 * priceUnit ="100"; sendText(price,priceUnit);
		 */

		clickOn(driver.findElement(By.xpath("//input[@value='Calculate']")));

		WebElement price = driver.findElement(By.cssSelector("input[id*='_txtUnitPrice']"));

		if (price.isDisplayed()) {
			System.out.println("Price is displayed after entering quantity of products");
		}

		else {
			System.out.println("Price is not displayed after entering quantity of products");
		}

		boolean disc_Display = driver.findElement(By.cssSelector("input[id*='_txtDiscount']")).isDisplayed();

		if (disc_Display == true) {
			System.out.println("Discount is displayed after entering quantity of products");
		} else {
			System.out.println("Discount is not dispalyed after entering quatity of products");

		}

		boolean total = driver.findElement(By.xpath("//input[contains(@id,'_txtTotal')]")).isDisplayed();
		if (total == true) {
			System.out.println("Total is displayed");
		}

		else {
			System.out.println("Total is not displayed");
		}

		WebElement cust_Name = driver.findElement(By.cssSelector("input[id*='txtName']"));
		String cName = "Pablo Piccaso";
		sendText(cust_Name, cName);
		WebElement street = driver.findElement(By.cssSelector("input[id*='_TextBox2']"));
		String str_Name = "Koko";
		sendText(street, str_Name);

		WebElement city = driver.findElement(By.cssSelector("input[id*='_TextBox3']"));
		String city_Name = "Monte-Carlo";
		sendText(city, city_Name);

		WebElement state = driver.findElement(By.xpath("//input[contains(@id,'_TextBox4')]"));
		String st_Name = "Monaco";
		sendText(state, st_Name);

		WebElement zip = driver.findElement(By.cssSelector("input[id*='_TextBox5']"));

		String zipCode = "20190";
		sendText(zip, zipCode);

		List<WebElement> payment = driver.findElements(By.xpath("//input[@type='radio']"));
		String card = "Visa";
		selectRadioButtonValue(payment, card);

		WebElement cardLine = driver.findElement(By.cssSelector("input[id*='_TextBox6']"));
		String cardNum = "12344566789";
		sendText(cardLine, cardNum);

		WebElement exp = driver.findElement(By.cssSelector("input[id*='_TextBox1']"));
		String expDate = "01/25";
		sendText(exp, expDate);

		clickOn(driver.findElement(By.cssSelector("a[id*='_InsertButton']")));

		clickOn(driver.findElement(By.linkText("View all orders")));

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr"));

		for (int rowNum = 2; rowNum <= rows.size(); rowNum++) {

			String text = driver.findElement(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr[" + rowNum + "]"))
					.getText();

			if (text.contains(cName)) {

				System.out.println(cName + " is displayed in the table");

				WebElement btn_Edit = driver
						.findElement(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr[" + rowNum + "]/td[13]"));
				clickOn(btn_Edit);
				break;

			}

		}

		boolean checkPR = driver.findElement(By.xpath("//option[text()='MyMoney']")).isSelected();

		isSelected(checkPR, pickPR);

		boolean checkAmount = driver.findElement(By.xpath("//input[@value='27']")).isDisplayed();
		isDisplayed(checkAmount, num);

		// I can do this way as well to verify details
		String checkName = driver.findElement(By.xpath("//input[@value='Pablo Piccaso']")).getAttribute("value");
		verifyDetails(checkName, cName);

		String checkStr = driver.findElement(By.xpath("//input[@value='Koko']")).getAttribute("value");
		verifyDetails(checkStr, str_Name);

		String checkCity = driver.findElement(By.xpath("//input[@value='Monte-Carlo']")).getAttribute("value");
		verifyDetails(checkCity, city_Name);

		boolean checkState = driver.findElement(By.xpath("//input[@value='Monaco']")).isDisplayed();

		isDisplayed(checkState, st_Name);

		boolean checkZipCode = driver.findElement(By.xpath("//input[@value='20190']")).isDisplayed();
		isDisplayed(checkZipCode, zipCode);

		boolean checkCard = driver.findElement(By.xpath("//input[@value='Visa']")).isSelected();
		isSelected(checkCard, card);

		String cardN = driver.findElement(By.xpath("//input[@value='12344566789']")).getAttribute("value");
		verifyDetails(cardN, cardNum);

		String check_ExpD = driver.findElement(By.xpath("//input[@value='01/25']")).getAttribute("value");
		verifyDetails(check_ExpD, expDate);

		WebElement Str = driver.findElement(By.xpath("//input[@value='Koko']"));
		String updatedStr = "Tiramisu";

		sendText(Str, updatedStr);

		clickOn(driver.findElement(By.cssSelector("a[id*='_UpdateButton']")));

		clickOn(driver.findElement(By.linkText("View all orders")));

	boolean flag = false;
		
		for (int rowNum = 2; rowNum <= rows.size(); rowNum++) {

			String text = driver.findElement(By.xpath("//table[contains(@id,'_orderGrid')]/tbody/tr[" + rowNum + "]"))
					.getText();

			if (text.contains(updatedStr)) {

				System.out.println("Updated street " + updatedStr + " is displayed in the table");
			  //  flag=true;
                break;
                
			}
		

		}
		
		if(!flag) {
			System.out.println("Updated street "+updatedStr +" is not displayed in the table");
		}

		driver.quit();
	}
}
