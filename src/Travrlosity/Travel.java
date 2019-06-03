package Travrlosity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Travel extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.travelocity.com/Flights?SEMCID=TRAVELOCITY-US.MULTILOBF.GOOGLE.GT-c-EN.FLIGHT&&SEMDTL=a1752860948.b138198135423.d1277162028531.e1c.f11t2.g1kwd-28170460.h1e.i1.j19007576.k1.l1g.m1.n1&gclid=EAIaIQobChMI9a7rtPfB4gIVE9VkCh0bagcREAAYAiAAEgI1R_D_BwE&gclsrc=aw.ds";
		setUpDriver("chrome", url);
		String to="Dublin, Ireland (DUB)";
		
		driver.findElement(By.cssSelector("input[id='flight-origin-flp']"))
				.sendKeys("Alexandria, LA (AEX-Alexandria In");

		driver.findElement(By.cssSelector("input[id='flight-destination-flp']")).sendKeys(to);

		driver.findElement(By.cssSelector("input[id='flight-departing-flp']")).sendKeys("01/31/2020");
		driver.findElement(By.cssSelector("input[id='flight-returning-flp']")).sendKeys("01/31/2020");

		driver.findElement(By.xpath("//button[@data-gcw-change-submit-text='Search']")).click();

		driver.findElement(By.xpath("//div[@class='bold announce-able']")).isDisplayed();
		
		/*
		 * if(el.isDisplayed()) { String text =
		 * driver.findElement(By.xpath("//div[@class='bold announce-able']")).getText();
		 * System.out.println("Text " +text+ " is displayed"); }
		 * 
		 * else { System.out.println("Text is not displayed"); }
		 */
		//Thread.sleep(2000);
		//driver.quit();
		
		
	}

}
