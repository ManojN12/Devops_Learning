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
import cucumber.api.java.en.When;
import lib.selenium.PreAndPost;

public class ListIncidents extends PreAndPost{
	
	public ListIncidents(EventFiringWebDriver driver, ExtentTest test) {	
		this.driver = driver;
		this.test = test;
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(xpath="//span[text()='Go to']/following::input[@placeholder='Search']") 
	private WebElement eleSearch;	
	


	
	public ListIncidents typeAndEnterSearch(String data) {	
		typeAndEnter(eleSearch,data);
		return this;
	}	

	
	
}
