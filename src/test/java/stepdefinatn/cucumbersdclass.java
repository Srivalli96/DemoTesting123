package stepdefinatn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbersdclass {
	
	WebDriver driver;
	@Given("^webdriver is initialized and application is opened$")
	public void webdriver_is_initialized_and_application_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prarabdha.badpanda\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	}

	 
	 
	@Given("^customer is at the registration page$")
	public void customer_is_at_the_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prarabdha.badpanda\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.get("http://10.211.155.19:8083/TestMeApp/RegisterUser.htm");
		System.out.println("Applictaion is opened");
	}

	@When("^customer provides \"(.*?)\" and \"(.*?)\"$")
	public void customer_provides_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 driver.get("http://localhost:8083/TestMeApp/RegisterUser.htm");
		 driver.findElement(By.id("userName")).sendKeys("Prarabdha15");
		 //driver.findElement(By.name("firstName")).click();
		  driver.findElement(By.id("firstName")).sendKeys("paroo");
		 driver.findElement(By.id("lastName")).sendKeys("sharma");
		 driver.findElement(By.name("password")).sendKeys("password12345");
		 driver.findElement(By.name("confirmPassword")).sendKeys("password12345");
		 driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("paro12345@gmail.com");
		 driver.findElement(By.name("mobileNumber")).sendKeys("9937570059");
		 driver.findElement(By.name("dob")).sendKeys("11/09/1996");
		 driver.findElement(By.name("address")).sendKeys("Hyderabad waverock");
         WebElement selectelement = driver.findElement(By.name("securityQuestion"));
         Select dd= new Select(selectelement);
      dd.selectByVisibleText("What is your favour color?");
      driver.findElement(By.id("answer")).sendKeys("Red");
      driver.findElement(By.name("Submit")).click();
		
	}

	@Then("^customer registration is successful$")
	public void customer_registration_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	boolean val= driver.findElement(By.xpath("//fieldset//div[8]")).isDisplayed();
	if(val = true)
		System.out.println(" registration successful ");
	else 
		System.out.println(" registration not successful ");
	    
	}

}
