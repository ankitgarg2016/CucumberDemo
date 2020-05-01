package Glues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;

public class Test2 {

	WebDriver driver;
	
	@When("^: I click on Siign in and enter mobile number$")
	public void i_click_on_Siign_in_and_enter_mobile_number() throws Throwable {
		driver.findElement(By.linkText("Sign In")).click();
		driver.switchTo().frame("authiframe");
		
		driver.findElement(By.xpath("authMobile")).sendKeys("70423349944");
	}

}
