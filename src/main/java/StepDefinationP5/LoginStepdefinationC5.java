package StepDefinationP5;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import AllPagesP5.LoginPageC5;
import GenericMethodP5.GenericMethodC5;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinationC5 extends LoginPageC5
{

	@Given("user should be login page")
	public static void user_should_be_login_page() throws IOException
	{
		browserInitzation();
		ExtentCucumberAdapter.addTestStepLog("Browser is initizated successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC5.captureScreenShot(), "Browser screenprint");
		Verify_title("Facebook – log in or sign");	
		ExtentCucumberAdapter.addTestStepLog("Title is matched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC5.captureScreenShot(), "title screenprint");
		
	}
	@Then("clicks on submit button")
	public static void clicks_on_submit_button() throws InterruptedException
	{
		Thread.sleep(5000);
		Click_login();
	}
	
	@When("user enters Valid username {string}")
	public static void user_enters_Valid_username(String username) throws IOException
	
	{
		Enter_email(username);
		ExtentCucumberAdapter.addTestStepLog("user is able to entered the username"+username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC5.captureScreenShot());
	}

	@When("^user enters valid Mutipleusernames\"([^\"]*)\"$")
	public static void user_enters_valid_Mutipleusernames(String username)
	{
		Enter_email(username);
		
	}
	
	@And("User enters valid password {string}")
public static void User_enters_valid_password(String password) throws IOException
	
	{
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("user is able to entered the password"+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC5.captureScreenShot());
	}
	
	@And("^user enters valid Mutiplepasswords\"([^\"]*)\"$$")
	public static void user_enters_valid_Mutiplepasswords(String password)
	{
		Enter_password(password);
	}
		
	@Then("Verify the error message")
	public static void Verify_the_error_message() throws IOException
	{		Verify_errormessage("Find your account and log in.");
	ExtentCucumberAdapter.addTestStepLog("Error is genered successfully");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC5.captureScreenShot());
		
	}
}
