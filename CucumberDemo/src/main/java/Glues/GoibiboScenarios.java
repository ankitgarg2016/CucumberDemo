package Glues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoibiboScenarios {

	WebDriver driver;
	

@Given("^: I am on homepage of the aplication$")
public void i_am_on_homepage_of_the_aplication() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ekta\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");		
	driver = new ChromeDriver(); // I am creating am instance/obejct of Webdriver class
//	driver.navigate().to("http://automationpractice.com/index.php");
	driver.get("https://www.goibibo.com/");
}

@When("^: I click on Siign in and enter mobile number$")
public void i_click_on_Siign_in_and_enter_mobile_number() throws Throwable {
	driver.findElement(By.linkText("Sign In")).click();
	driver.switchTo().frame("authiframe");
	
	driver.findElement(By.xpath("authMobile")).sendKeys("70423349944");
}

@Then("^: click on Continue$")
public void click_on_Continue() throws Throwable {
 
}

@Then("^: enter the password$")
public void enter_the_password() throws Throwable {
    
}
}
