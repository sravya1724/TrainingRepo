package AllPagesP5;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseP5.BaseC5;
import GenericMethodP5.GenericMethodC5;

public class LoginPageC5  extends BaseC5{
	
	
	public static  By EMailInput=By.xpath("//input[@id='email']");
	public static  By EMailpassword=By.xpath("//input[@id='pass']");
	public static  By Buttonlogin=By.xpath("//button[@name='login']");
	public static By Errormessage=By.xpath("//a[text()='Find your account and log in.']");
	public static By title=By.xpath("//title");
	public static SoftAssert sa= new SoftAssert();
	
	public static void Enter_email(String emailid)
	{
		driver.findElement(EMailInput).sendKeys(emailid);
	}

	public static void Enter_password(String passwordid)
	{
		driver.findElement(EMailpassword).sendKeys(passwordid);
	}


	
	public static void Click_login()
	{
		//driver.findElement(Buttonlogin).click();
		WebElement Ele= driver.findElement(Buttonlogin);
		GenericMethodC5.JavascriptExecutor_click(Ele);
		
	}

	public static void Verify_title(String Expectedtitle)
	{
		String actualtitle=driver.getTitle();
		sa.assertEquals(actualtitle, Expectedtitle, "actual title and expected title not matched");
		//sa.assertTrue(driver.findElement(Buttonlogin).isEnabled()," button is disable");	
	}	
		
//	if(actualtitle.equals(Expectedtitle))
//	{
//		System.out.println("title is matching");
//		return true;
//	}
//	else
//	{
//		System.out.println("title is not matching");
//		return false;
//	}
	public static void Verify_errormessage(String Expectederrormessage)
	{
		String actualerrormessage =	driver.findElement(Errormessage).getText();
		sa.assertEquals(actualerrormessage, Expectederrormessage, "actual errormessage and expected errormessage not matched");
			
	}
		
	}

