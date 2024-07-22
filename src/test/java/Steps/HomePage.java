package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;

public class HomePage extends BaseClass{

	@Given("user validate logo")
	public void user_validate_logo() {
	    boolean logo=driver.findElement(By.xpath("//img[@src=\"/web/images/orangehrm-logo.png?v=1711595107870\"]")).isDisplayed();
	    Assert.assertEquals(logo, true);
	}
}
