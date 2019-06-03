package Upload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class FIleUpload extends CommonMethods
{
	
	
	public static void main(String[] args) {
		String url = "https://the-internet.herokuapp.com/";
		setUpDriver("chrome",url); 
		
		driver.findElement(By.linkText("File Upload")).click();
		
		String path= "C:/Users/talga/Pictures/Screenshots/Screenshot (31).png";
		
		driver.findElement(By.id("file-upload")).sendKeys(path);
		driver.findElement(By.id("file-submit")).click();
		
		boolean isDisplayed=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).isDisplayed();
		
		if (isDisplayed) {
			System.out.println("File uploaded successfully");
		}else {
			System.out.println("File uploaded successfully");
		}
		
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File pic = ts.getScreenshotAs(OutputType.FILE);
         try { 
		   FileUtils.copyFile(pic, new File("syntax01/Proof/Upload.png"));
	}
		catch(IOException e) { 
	 	
			e.printStackTrace(); 
	 	} 
	
		
		
		
		
		
	}

}
