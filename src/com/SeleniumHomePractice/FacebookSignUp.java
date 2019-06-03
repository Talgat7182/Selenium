package com.SeleniumHomePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//talga//Selenium//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("input#u_0_c")).sendKeys("Talgat");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Makabayev");
		driver.findElement(By.cssSelector("input#u_0_h")).sendKeys("7038145122");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ifacebook7");

		WebElement bmonth = driver.findElement(By.cssSelector("select[name='birthday_month']"));
		
		Select select = new Select(bmonth);
		
		select.selectByVisibleText("Aug");
		
		//List<WebElement> allOptions = select.getOptions();
		WebElement bday = driver.findElement(By.cssSelector("select#day"));
		Select select1 = new Select(bday); 
		select1.selectByValue("27");
		
		WebElement year = driver.findElement(By.cssSelector("select[name*=birthday_y]"));
		Select select2= new Select(year);
		select2.selectByValue("1991");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

		/*
		 * String Bdmonth = "Aug"; for (WebElement m : allOptions) {
		 * 
		 * if (m.equals(Bdmonth)) {
		 * 
		 * m.click();
		 * 
		 * Thread.sleep(2000);
		 */
			//}

			/*WebElement bday = driver.findElement(By.xpath("//select[@name='birthday_day']"));

			Select select1 = new Select(bday);
			List<WebElement> dOptions = select1.getOptions();
			int day = 0;

			for (WebElement d : dOptions) {

				day++;
             
				if (day == 27) {

					break;
					*/
					


		
	}
}
