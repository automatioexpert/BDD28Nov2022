package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",glue= {"steps"},

plugin = {"html:target/cucumber-reports/cucumber_report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = "@staging or @prod")
public class RunCuke extends AbstractTestNGCucumberTests{

	
}
