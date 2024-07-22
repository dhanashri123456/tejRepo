package Steps;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class AdminPage extends BaseClass{

	@When("user click on admin page")
	public void user_click_on_admin_page() {
	   driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
}
