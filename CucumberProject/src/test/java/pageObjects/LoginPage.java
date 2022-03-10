	package pageObjects;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='Password']")
	WebElement password;
	@FindBy(xpath="//*[text()='Log in']")
	WebElement loginButton;
	@FindBy(xpath="//*[text()='Logout']")
	WebElement logout;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setUsername(String uname)
	{
		email.clear();
		email.sendKeys(uname);
		//email.sendKeys(Keys.ENTER);
	}
	public void setPassword(String Password) throws InterruptedException
	{
		password.clear();
		password.sendKeys(Password);
		Thread.sleep(2000);
	}
	public void clickLogin() throws InterruptedException
	{
		loginButton.click();
		Thread.sleep(2000);
	}
	public void clickLogout()
	{ 
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", logout);
		//logout.click();
	}
	

}
