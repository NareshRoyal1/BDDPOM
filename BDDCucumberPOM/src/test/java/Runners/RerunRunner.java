package Runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="@target//failedScenario.txt",
glue= {"stepDefs"})
public class RerunRunner extends AbstractTestNGCucumberTests {
  
  
}
