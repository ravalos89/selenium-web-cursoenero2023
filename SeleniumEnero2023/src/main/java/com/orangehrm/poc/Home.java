package com.orangehrm.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.selenium.Base;

public class Home extends Base{

	public Home(WebDriver driver) {
		super(driver);
	}

	By imgOrangeHrmHeader = By.xpath("//img[@alt='client brand banner']");
	By imgProfilePicture = By.xpath("//img[@class='oxd-userdropdown-img']");
	
	/*
	 * HEADER
	 * 
	 */
	public boolean profilePictureisDisplayed() {
		takeScreenshot("After login");
		waitForElementPresent(imgOrangeHrmHeader);
		takeScreenshot("Validate Img Orange Header");
		return isDisplayed(imgProfilePicture);		
	}
}
