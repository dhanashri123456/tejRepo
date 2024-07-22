package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   BaseClass.initialization();
	}

	@When("User enter username and pass")
	public void user_enter_username_and_pass() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

}
