package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
WebDriver driver;

public AddCustomerPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

By Customers=By.xpath("//li[4][@class='nav-item has-treeview']");

By CustomerLink=By.xpath("//li[@class='nav-item']//p[text()=' Customers']");
By AddNewButton =By.xpath("//div[@class='float-right']/a");
By email =By.id("Email");
By password= By.id("Password");
By firstname=By.id("FirstName");
By lastName=By.id("LastName");
By rdMaleGender=By.id("Gender_Male");
By rdFemaleGender= By.id("Gender_Female");
By txtDateOfBirth= By.id("DateOfBirth");
By txtCompanyName=By.id("Company");
By chkIstextExempt=By.id("IsTaxExempt");
By txtNewsLetter= By.xpath("//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div");
By txtCustomerRole=By.xpath("//*[@class='input-group-append input-group-required']");
By listForumModerators= By.xpath("//li[text()='Forum Moderators']");
By txtManageGender=By.id("VendorId");
By vendorList= By.xpath("//option[text()='VendorId']");
By txtAdminComment=By.id("AdminComment");



}
