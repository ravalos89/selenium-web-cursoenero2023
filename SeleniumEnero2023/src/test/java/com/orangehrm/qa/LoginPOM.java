package com.orangehrm.qa;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orangehrm.poc.Login;
import com.orangehrm.poc.Home;
import com.orangehrm.selenium.Base;
import com.orangehrm.selenium.GlobalVariables;

public class LoginPOM {
	
	WebDriver driver;
	Base base;
	
	//Lawyer 2
	Login login;
	Home home;
	
	String username, password, incorrectPassword, expectedErrorMessage;
	String jsonName = "LoginData";
	
  
  @BeforeTest
  public void beforeTest() {
	  base = new Base(driver);
	  driver = base.chromeDriverCon();
	  login = new Login(driver);
	  home = new Home(driver);
	  
	  // Test Data
	  this.username = base.getJSONValue(jsonName, "username");
	  this.password = base.getJSONValue(jsonName, "password");
	  this.incorrectPassword = base.getJSONValue(jsonName, "incorrectPassword");
	  this.expectedErrorMessage = base.getJSONValue(jsonName, "expectedErrorMessage");
  }
  
  @Test
  public void tc001LoginUser() {
	  
	  // Step 1
	  base.launchBrowser(GlobalVariables.QA_URL);
	  
	  // Step 2
	  login.login(username, password);
	  
	  // Step 3
	  Assert.assertEquals(home.profilePictureisDisplayed(), true);
  }
  
  @Test
  public void tc002LoginFailed() {
	  
	  // Step 1 - Launch browser and maximize Orange HRM
	  base.launchBrowser(GlobalVariables.QA_URL);
	  
	  // Step 2 - Enter incorrect username or password and click Login button
	  login.login(username, incorrectPassword);
	  
	  // Step 3 - Validate Login error message
	  Assert.assertEquals(login.validateLoginError(), true);
	  Assert.assertEquals(login.validateLoginErrorText(), expectedErrorMessage);
  }
  
  

  @AfterTest
  public void afterTest() {
	  // Close Browser
	  driver.close();
  }

}
