package com.orangehrm.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.commons.codec.binary.Base64;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	// Chrome driver
	/*
	 * @name: chromeDriverCon
	 * @date: 18/Feb/2023
	 * @param: NA
	 * @return: driver
	 * @author: ricardo.avalos@cooltesters.com
	 * @description: QUE HACE MI METHOD?
	 */
	public WebDriver chromeDriverCon() {
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOpt);
		return driver;
	}
	
	// Launch browser
	public void launchBrowser(String url) {
		try {
			reporterLog("Launching... "+url);
			driver.get(url);
			driver.manage().window().maximize();
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	// Reporter
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	// Explicit wait
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.DEFAULT_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForElementPresent(By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	// Type method
	public void type(By locator, String inputText) {
		try{
			driver.findElement(locator).sendKeys(inputText);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	// Click method
	public void click(By locator) {
		try{
			waitForElementPresent(locator);
			//Method screenshot
			driver.findElement(locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	// isDisplayed
	public boolean isDisplayed(By locator) {
		try{
			return driver.findElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// Get Text
	public String getTextFromObject(By locator) {
		try{
			return driver.findElement(locator).getText();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			return "Object is not displayed correctly";
		}
	}
	
	/**
	 * Get Data from JSON file (Directly)
	 * 
	 * @author Ricardo Avalos
	 * @param jsonFile, jsonKey
	 * @return jsonValue
	 * @throws FileNotFoundException
	 */
	public String getJSONValue(String jsonFileObj, String jsonKey){
		try {

			// JSON Data
			InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

			// Get Data
			String jsonValue = (String) jsonObject.get(jsonKey);
			return jsonValue;

		} catch (FileNotFoundException e) {
			Assert.fail("JSON file is not found");
			return null;
		}
	}
	
	public String getEncryptedPassword(String encryptedPwd) {
		byte[] decodedBytes = Base64.decodeBase64(encryptedPwd);
		return new String(decodedBytes);
	}
	

}
