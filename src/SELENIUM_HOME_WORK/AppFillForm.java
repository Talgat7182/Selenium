package SELENIUM_HOME_WORK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class AppFillForm extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.linkText("Form")).click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id='firstname']"));
		sendText(firstName, "Tom");
		WebElement lastName = driver.findElement(By.xpath("//*[@id='lastname']"));
		sendText(lastName, "Sawyer");

		List<WebElement> rdBtn_status = driver.findElements(By.xpath("//label[starts-with(@class,'radio')]"));

		String status = "Married";

		selectRadioButtonText(rdBtn_status, status);

		List<WebElement> rdBtn_hobby = driver.findElements(By.xpath("//input[@type='checkbox']"));

		String hobby1 = "Read";
		// String hobby2 ="Dancing";

		selectCheckBox(rdBtn_hobby, hobby1);

		// selectCheckBox(rdBtn_hobby,hobby2);

		WebElement sel1 = driver.findElement(By.xpath("//select[@id='sel1']"));
		String country = "Denmark";
		selectValueFromDD(sel1, country);
// Handling calendar 
		clickOn(driver.findElement(By.xpath("//input[@id='datepicker']")));

		WebElement sel_Month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		String bd_Month = "Feb";

		selectValueFromDD(sel_Month, bd_Month);
		
		WebElement sel_Year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		String value = "2019";
		
		selectValueFromDD(sel_Year, value);
		
		List<WebElement>sel_Day =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		String day ="11";
		pickDatefromCalendar(sel_Day, day);
		
		WebElement phoneN=driver.findElement(By.cssSelector("input#phonenumber"));
		String ph_Number ="7038142155";
		sendText(phoneN, ph_Number);
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		String e_Adress = "javakiller@gmail.com";
		sendText(email,e_Adress);
		
	WebElement comment = driver.findElement(By.xpath("//textarea[@id ='comment']"));
	String textComment ="Hi! My name is Elon. I like to send rockets to space. You think we have something in common?"; 
	sendText(comment, textComment);
	
	
	WebElement pwd = driver.findElement(By.cssSelector("input#pwd"));
	String pathword = "LogicFinder7";
	sendText(pwd,pathword);
	
	clickOn(driver.findElement(By.cssSelector("button[class*='btn-default']")));
	

		Thread.sleep(3000);
		driver.quit();

	}
}
