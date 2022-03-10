package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class Steps {
	
public WebDriver driver;
public LoginPage lp;
	@Given("User launch the Chrome browser")
	public void user_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		lp=new LoginPage(driver);
		
	   
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String URL) {
		driver.get(URL);
	 
	}
	@Then("Enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String username, String password) throws InterruptedException {
		
	   lp.setUsername(username);
	   Thread.sleep(2000);
	   
	   lp.setPassword(password);
	}


	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
	   
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be1(String string) {
	    Assert.assertEquals(string,driver.getTitle());
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		Thread.sleep(3000);
	   lp.clickLogout();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
	    Assert.assertEquals(string,driver.getTitle());
	}

	@Then("close Browser")
	public void close_browser() {
	    driver.close();
	}
}
