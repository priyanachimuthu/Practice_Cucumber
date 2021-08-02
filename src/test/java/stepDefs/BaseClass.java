package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
	public static WebDriver driver;

	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	    	
    	driver = new ChromeDriver();
	}
	
	@After
	public void teardown() throws InterruptedException {
		
		WebElement drop_menu = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
    	drop_menu.click();
    	Thread.sleep(1000);
    	
    	WebElement Logout = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
    	Logout.click();
    	Thread.sleep(1000);
    	
		
		driver.quit();
	}
	
}
