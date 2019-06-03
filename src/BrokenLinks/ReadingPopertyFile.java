package BrokenLinks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class ReadingPopertyFile extends CommonMethods {

	Properties prop;
	
	@Test
	public void readFile() {
		
		String filePath="src/Configs/Credentials.properties";
	 
		
		try { 
			
			FileInputStream fis =new FileInputStream(filePath); 
		    prop = new Properties();
			prop.load(fis);
			
			//Select select = new Select(
			
		}
		catch (FileNotFoundException e ) { 
			e.printStackTrace();
		}
		catch(IOException e) {
		e.printStackTrace(); 
		
		
		}
		/*
		 * String browser = prop.getProperty("browser");
		 * 
		 * String url = prop.getProperty("url");
		 */
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		
	    WebElement element = driver.findElement(By.xpath("//span[text()='Username']"));
	    sendText(element,username);
	    WebElement element1 = driver.findElement(By.xpath("//span[text()='Password']"));
	   sendText(element1,password);
	  WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
	  clickOn(login);
	  String Expected= "Dashboard";
		
	   String actual= driver.findElement(By.xpath("//h1[text()='Dashboard']")).getText();
		String message="Actual value is matched with expected = "+Expected;
		
		Assert.assertEquals(actual, Expected);
		System.out.println(message);
	
		driver.quit();
			
			
		}
	}

