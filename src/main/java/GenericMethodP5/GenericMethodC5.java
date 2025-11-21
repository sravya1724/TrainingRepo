package GenericMethodP5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import BaseP5.BaseC5;

public class GenericMethodC5 extends BaseC5 {

	
	public static void JavascriptExecutor_click(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		  js.executeScript("arguments[0].click();", ele);
	}
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)BaseC5.driver;
		//we are Takescreenshot as interface and converting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
			
		File destfile=new File("C://Sravya files//SRAVYA//SRAVYA editor files"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	
	
	
	
}
