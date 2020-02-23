package com.hms.setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BasePage
{
	private WebDriver driver;
	

	public WebDriver getDriver() {
		return driver;
	}

	public void initilaize(String browser, String url) 
	{
		String basePath = System.getProperty("user.dir");
		
		switch (browser) {
		case "IE":
			System.setProperty("webdriver.ie.driver",basePath+"\\Driver\\"+ "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
			break;
		case "FF":
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver",basePath+"\\Driver\\"+ "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;
		default:
			driver = new FirefoxDriver();
			driver.get(url);
		}
	}


	
	@BeforeClass
	@Parameters({ "browserName", "url" })
	public void setup(String browser, String url1) {
		initilaize(browser, url1);
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
