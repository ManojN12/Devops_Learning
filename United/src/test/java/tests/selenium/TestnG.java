package tests.selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestnG {
	 
	String assertionString="demoforHardAssertion";
	 @Test
	  public void test1() 
	  {
		 SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("demoforHardAssertions", assertionString);	 
		softAssert.assertAll();  
	  }
		
	 @Test
	  public void test2() 
	  {
		 SoftAssert softAssert=new SoftAssert();
		 softAssert.assertEquals("demoforHardAssertion", assertionString);	  
		 softAssert.assertAll(); 
		  
	  }
 
}