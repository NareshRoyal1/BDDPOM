package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features//",
glue= {"stepDefs"},
monochrome=true,
dryRun=false,
plugin={"pretty","html:target//Reports//htmlReport.html",
		"usage:target//Reports//UsageReport",
		"json:target//Reports//JsonReport.json",
		"rerun:target//failedScenario.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class GooglePageRunner extends AbstractTestNGCucumberTests {
	

}
