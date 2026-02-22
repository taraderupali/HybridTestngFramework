package runner;

import io.cucumber.testng.*;
import org.testng.annotations.*;

@CucumberOptions(
	    features = "classpath:features",
	    glue = {"stepdefinitions","hooks"},
	    plugin = {
	        "pretty",
	        "html:target/cucumber-report.html",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        "json:target/cucumber.json",
	    
	    },
	    monochrome = true
	)


public class TestRunner extends AbstractTestNGCucumberTests 
{
	@Override
    @DataProvider(parallel = true)   // 🔥 Enables Parallel
    public Object[][] scenarios() {
    return super.scenarios();
}
}