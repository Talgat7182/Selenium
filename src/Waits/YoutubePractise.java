package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;;
public class YoutubePractise extends CommonMethods {

	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.facebook.com/"; 
		setUpDriver("chrome", url);
		
		// i have dynamic page load & implicitly waits in my CommonMethod class, which I am extending
		// it is not recommended to have implicit and explicit right? Since it increases time first it implements implicit wait
		// which is global, then it applies explicit ( if the pages takes 15 seconds to load and then we have 10 seconds for explicit )
		
		WebElement firstName = driver.findElement(By.cssSelector("input#u_0_c")); 
		WebElement lastName = driver.findElement(By.xpath("//input[@id='u_0_e']")); 
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']")); 
		WebElement forgotAccount = driver.findElement(By.linkText("Forgot account?")); 
		
		sendKeys(driver,firstName,10,"Tom");
		sendKeys(driver,lastName,5,"Peterson"); 
		sendKeys(driver,mobileNumber,5,"7038142155");
		// did static wait, just to see what's going on
		Thread.sleep(2000);
		
		clickOn(driver,forgotAccount,10);
		
		// we can create our explicit wait method 
		
		
			
		
	}
}
