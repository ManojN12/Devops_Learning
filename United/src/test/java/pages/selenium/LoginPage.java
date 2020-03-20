package pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import lib.selenium.PreAndPost;

public class LoginPage extends PreAndPost{
	
	public LoginPage(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		driver.switchTo().frame(0);
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(id="user_name") 
	private WebElement eleUserName;	
	
	@FindBy(id="user_password")
	private WebElement elePassword;	
	
	@FindBy(how=How.ID,using="sysverb_login")
	private WebElement eleLogin;

	
	@Given("Enter username as (.*)")
	public LoginPage typeUserName(String data) {	
		type(eleUserName, data);
		return this;
	}	

	@Given("Enter password as (.*)")
	public LoginPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}	
	
	@Given("Click the Login")
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage(driver,test);		
	}
	
}
