package stepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

	WebDriver driver =BaseClass.driver;
		
	 @Given("^I am a SwagLabs  user$")
	 public void i_am_a_swaglabs_user() throws Throwable {
        
			    	
    	driver.get("https://www.saucedemo.com/");	    	
    	driver.manage().window().maximize();			
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

	    @When("^I enter the username \"([^\"]*)\" and the passcode \"([^\"]*)\"$")
	    public void i_enter_the_username_something_and_the_passcode_something(String username, String password) throws Throwable {
    	
    	WebElement User_name = driver.findElement(By.xpath("//*[@id='user-name']"));
    	User_name.sendKeys(username);
    	
    	WebElement pass_word = driver.findElement(By.xpath("//*[@name='password']"));
    	pass_word.sendKeys(password);
    	
    }

	    @And("^click the Login button$")
	    public void click_the_login_button() throws Throwable {
    	
    	WebElement Loginbutton = driver.findElement(By.xpath("//*[@id='login-button']"));
		Loginbutton.click();
    }
    
	    @Then("^I login to the SwagLabs application$")
	    public void i_login_to_the_swaglabs_application() throws Throwable {
    	
    	WebElement Homepage = driver.findElement(By.xpath("//*[@class='title']"));
    	Homepage.isDisplayed();
    	
    	
    	
        }
    
	    @Then("^I can view the error message \"([^\"]*)\"$")
	    public void i_can_view_the_error_message_something(String Experror) throws Throwable {
    	
    	WebElement Homepage = driver.findElement(By.xpath("//*[@data-test='error']"));
    	
        String ActError = Homepage.getText();
        
        Assert.assertEquals(ActError, Experror);
        
        driver.quit();
        }


	
}
