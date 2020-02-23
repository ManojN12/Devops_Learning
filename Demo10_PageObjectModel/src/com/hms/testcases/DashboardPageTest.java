package com.hms.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hms.pageobjects.DashboardPage;
import com.hms.pageobjects.LoginPage;
import com.hms.setup.BasePage;

public class DashboardPageTest extends BasePage {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = getDriver();
	}

	@Test
	public void verifyLogin() {

		LoginPage login = new LoginPage(driver);

		DashboardPage d = login.Sigin("11", "priya");
		Boolean status=d.verifyLogin("Hi, Priya Jain");
		if(status)
			System.out.println("Login success");
		else
			System.out.println("Login failure");
			


	}

}
