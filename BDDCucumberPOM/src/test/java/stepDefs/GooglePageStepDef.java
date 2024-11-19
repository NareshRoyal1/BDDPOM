package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("user is on google page")
	public void user_is_on_google_page() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		Assert.assertEquals("Google", driver.getTitle());
	   
	    
	}
	@When("user search java tutorial")
	public void user_search_java_tutorial() {
	    WebElement SearchBox=driver.findElement(By.name("q"));
	    SearchBox.sendKeys("java Tutorial");
	    SearchBox.submit();
	   
	}
	@Then("should display java tutorial")
	public void should_display_java_tutorial() {
		System.out.println(driver.getTitle());
		Assert.assertEquals("java Tutorial - Google Search", driver.getTitle());
	    
	}

	
	 @When("user search selenium tutorial") public void
	 user_search_selenium_tutorial() { WebElement
	 SearchBox=driver.findElement(By.name("q"));
	 SearchBox.sendKeys("selenium Tutorial"); SearchBox.submit(); }
	 
@Then("should display selenium tutorial")
public void should_display_selenium_tutorial() {
	System.out.println(driver.getTitle());
	Assert.assertEquals("selenium Tutorial - Google Search", driver.getTitle());
    
}
@After
public void AttachScreenshot(Scenario scenario) {
	if(scenario.isFailed()) {
		//TakesScreeshot screen= (TakeScreenShot)driver;
	}
	
}

}
