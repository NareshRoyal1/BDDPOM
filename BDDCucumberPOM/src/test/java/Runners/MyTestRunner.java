package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src//test//resources//Features//PlaceOrder.feature",
glue= {"stepDefs"},
monochrome=true,
dryRun=false,
plugin={"pretty","html:target//Reports//htmlReport.html"
		}
)

public class MyTestRunner extends AbstractTestNGCucumberTests {

}
