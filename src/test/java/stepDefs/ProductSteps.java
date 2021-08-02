package stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

	WebDriver driver =BaseClass.driver;
	
	@Given("^I open the swaglab application$")
    public void i_open_the_swaglab_application() throws Throwable {
		
		driver.get("https://www.saucedemo.com/");	
		
    	driver.manage().window().maximize();	
    	
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }
	
	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_username_something_and_password_something(String username, String password) throws Throwable {
		
		WebElement User_name = driver.findElement(By.xpath("//*[@id='user-name']"));
    	User_name.sendKeys(username);
    	
    	WebElement pass_word = driver.findElement(By.xpath("//*[@name='password']"));
    	pass_word.sendKeys(password);
        
    }

	 @And("^Click on Login button$")
	 public void click_on_login_button() throws Throwable {
    	
    	WebElement Loginbutton = driver.findElement(By.xpath("//*[@id='login-button']"));
		Loginbutton.click();
        
    }
    
/*Product page*/
    @Given("^I am in Product page$")
    public void i_am_in_product_page() throws Throwable {
    	
    	WebElement Homepage = driver.findElement(By.xpath("//*[@class='title']"));
    	Homepage.isDisplayed();
    	Thread.sleep(2000);
        
    }

   
    @When("^I click on Add to cart for one item \"([^\"]*)\"$")
    public void i_click_on_add_to_cart_for_one_item_something(String product) throws Throwable {
    	
    	WebElement Add_cart1 = driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Backpack')]//following::button[1]"));
    	Add_cart1.click();
    	Thread.sleep(3000);
    	
    	/*WebElement Add_cart2 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']"));
    	Add_cart2.click();*/
    }
    
    @And("^navigate to Mycart$")
    public void navigate_to_mycart() throws Throwable {
    	
    	WebElement my_cart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
    	my_cart.click();
    	Thread.sleep(2000);
    	
    }
    
    @And("^again remove the same item$")
    public void again_remove_the_same_item() throws Throwable {
        
    	WebElement remove_1 = driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));
    	remove_1.click();
    	Thread.sleep(2000);
    }
	

    @Then("^I can view the final selected product$")
    public void i_can_view_the_final_selected_product() throws Throwable {
            	 
    	WebElement cart_list = driver.findElement(By.xpath("//*[contains(@class,'cart_quantity_label')]"));
    	cart_list.isDisplayed();
    	Thread.sleep(3000);
    	
    }
    
    
}
