
package com.SeleniumHomePractice;

import org.openqa.selenium.By;

import utils.CommonMethods;
public class FrameRecap  extends CommonMethods {

		public static void main(String[] args) {
			

			CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
			
			driver.switchTo().frame("iframe2");
		// by xpath	//iframe[@name='iframe2']	
		// ot by id==> driver.switchTo().frame(by.id('IF2"])
			
		// i can simply put id without clarifying that it is by id or name
		// driver.switchTo().frame("IF2"); 
			boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		
		if(isDisplayed) {
			
			System.out.println("Iteractions is displayed");
		}
		
			
		else { 
			System.out.println("Iteractions is not dispalyed");
		}
			driver.switchTo().defaultContent();

		}

	}

