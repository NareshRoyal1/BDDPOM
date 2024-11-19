package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepdef {
	WebDriver driver;

@Given("user is on the login page")
public void user_is_on_the_login_page() {
	 driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://the-internet.herokuapp.com/login");
	
}
@When("user enter the credentials")
public void user_enter_the_credentials() {
	 WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("tomsmith");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("SuperSecretPassword!");
	  driver.findElement(By.className("radius")).click();
}
@Then("navigate to home page")
public void navigate_to_home_page() {
	
	boolean success=driver.findElement(By.cssSelector("div.success")).isDisplayed();
	
	Assert.assertTrue(success);
   
}

}
