package BaseP5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC5 
{
// WebDriver initalization
	// browser- closing
	//browser launch
	//DB connection
	public static String browser="Chrome";
	public static String URL="https://fb.com";
	public static WebDriver driver;
	
	public static void browserInitzation()
	{
		switch(browser)
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			
			 driver= new ChromeDriver();
			try
			{
				if((URL.length()==0 ))
				{
				throw new URLexception("URL is Incorrect");
				}
				else
				{
			 driver.get(URL);
			 break;
				}
			}
			catch(URLexception E)
			{
				System.out.println(E);
				 driver.get("https://fb.com");
				 break;
			}
			
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 break;	
			
		}
		
	}
	
	public static void browser_close()
	{
		driver.close();
	}
}
