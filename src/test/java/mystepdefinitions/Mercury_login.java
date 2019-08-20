package mystepdefinitions;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mercury_login {
	WebDriver driver;
	@Given("User has launched the application")
	public void user_has_launched_the_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  Dimension d=new Dimension(300,600);
		  driver.manage().window().setSize(d);
		  Point p=new Point(200,300);
		  driver.manage().window().setPosition(p);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User enters the valid credentials")
	public void user_enters_the_valid_credentials() {
		driver.findElement(By.name("userName")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.name("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User verifies the login status")
	public void user_verifies_the_login_status() {
		String actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]")).getText();
		String expected="SIGN-OFF";
		Assert.assertEquals(actual, expected);
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("User launched the app of mercury tours")
	public void user_launched_the_app_of_mercury_tours() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com/");
		  driver.manage().window().maximize();

		 
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	}

	@Then("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("REGISTER")).click();
	}

	@When("User enters the valid data in the form")
	public void user_enters_the_valid_data_in_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("firstName")).sendKeys("Gayathri");
		driver.findElement(By.name("lastName")).sendKeys("Shantha");
		driver.findElement(By.name("phone")).sendKeys("8019990224");
		driver.findElement(By.name("userName")).sendKeys("gayathrishantha@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("1-3-5,hemanagar,hyd");
		driver.findElement(By.name("city")).sendKeys("hyd");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500029");
		
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByValue("92");
		driver.findElement(By.name("email")).sendKeys("GayathriShantha");
		driver.findElement(By.name("password")).sendKeys("chitlu@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("chitlu@123");
		
		
	}

	@When("User clicks on submit button available")
	public void user_clicks_on_submit_button_available() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("register")).click();
	}

	@Then("User verifies the registration status")
	public void user_verifies_the_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]")).getText();
		String expected="SIGN-OFF";
		Assert.assertEquals(actual, expected);
		
       
}
}
