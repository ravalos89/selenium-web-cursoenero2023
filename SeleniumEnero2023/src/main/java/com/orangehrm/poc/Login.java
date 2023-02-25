package com.orangehrm.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.selenium.Base;

public class Login extends Base{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	// Objects
	By txtUsername = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By lblLoginError = By.xpath("//div[@class='orangehrm-login-error']");
	By lblLoginErrorText = By.xpath("//p[contains(@class, 'content-text')]");
	
	/*
	 * @name: login
	 * @date: 18/Feb/2023
	 * @param: NA
	 * @return: NA
	 * @author: ricardo.avalos@cooltesters.com
	 * @description: QUE HACE MI METHOD?
	 */
	public void login(String username, String password) {
		reporterLog("Logging with user: "+username);
		waitForElementPresent(btnLogin);
		type(txtUsername, username);
		type(txtPassword, getEncryptedPassword(password));
		click(btnLogin);
	}
	
	public boolean validateLoginError() {
		waitForElementPresent(lblLoginError);
		takeScreenshot("Validate Login Error");
		return isDisplayed(lblLoginError);
	}
	
	public String validateLoginErrorText() {
		takeScreenshot("Validate Login Error Text");
		return getTextFromObject(lblLoginErrorText);
	}

}
