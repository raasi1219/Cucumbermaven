package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	
	
	@Given("We should be in the Home page")
	public void we_should_be_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ChintalapatiRaasi\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		    
		    driver = new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  //  driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	@When("Enter the valid name {string}")
	public void enter_the_valid_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("identifierId")).sendKeys(string);
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	
	@When("Enter valid password {string}")
	public void enter_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("txtPassword")).sendKeys(string);
	   
	    
	}

	@When("Click on Login validButton")
	public void click_on_login_valid_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("btnLogin")).click();

	}
	@Then("I should see username as {string}")
	public void i_should_see_username_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String Expected = driver.findElement(By.id("welcome")).getText();
		//String Actual = "Welcome Paul";
		Assert.assertEquals(Expected, string);
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		 // driver.close();
	}
/*	@Then("Login Should be Successfull")
	public void login_should_be_successfull() throws InterruptedException {
		
		String Expected = driver.findElement(By.id("welcome")).getText();
		String Actual = "Welcome Paul";
		Assert.assertEquals(Expected, Actual);
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		// driver.findElement(By.id("welcome")).click();
	} */
	
	@When("Enter the invalid name {string}")
	public void enter_the_invalid_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	
	@When("Enter invalid Password {string}")
	public void enter_invalid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("txtPassword")).sendKeys(string);
	}

	@When("Click on Login invalidButton")
	public void click_on_login_invalid_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("I should see the invalid credential as {string}")
	public void i_should_see_the_invalid_credential_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//String Expected = driver.findElement(By.id("welcome")).getText();
		String Actual = "Invalid credentials";
	 //	Assert.assertEquals(string, Actual);
	}

 /*	@Then("Login should be unsuccessful")
	public void login_should_be_unsuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	} */

}
