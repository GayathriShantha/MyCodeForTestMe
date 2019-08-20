package mystepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parametersdemo {
	WebDriver driver;

	@Given("testme is launched by user")
	public void testme_is_launched_by_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		 
		
	}

	@When("user clicks on SignIn link in login page")
	public void user_clicks_on_SignIn_link_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("user provides the valid username {string}")
	public void user_provides_the_valid_username(String uname) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("userName")).sendKeys(uname);
		
	}

	@Then("user provides the valid password {string}")
	public void user_provides_the_valid_password(String pswrd) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(pswrd);
		
	}

	@Then("user clicks for the submission of the data")
	public void user_clicks_for_the_submission_of_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
		
	}

	@Then("verifies the login status for the account")
	public void verifies_the_login_status_for_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	
		String actual=driver.findElement(By.linkText("SignOut")).getText();
		String expected="SignOut";
		Assert.assertEquals(actual, expected);
		driver.close();
	}


}
