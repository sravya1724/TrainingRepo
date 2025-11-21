package RunnerP5;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = {"featuresP5/loginP5.feature"},
glue =     {"StepDefinationP5"},
plugin =    { "pretty","html:target/cucumber-reports",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	tags="@reg",               	
 monochrome = true )

public class RunnerC5 extends AbstractTestNGCucumberTests
{

}
