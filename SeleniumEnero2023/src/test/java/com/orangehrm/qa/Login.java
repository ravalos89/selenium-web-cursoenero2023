package com.orangehrm.qa;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Login {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@Test
	public void tc001Login() {

		Reporter.log("Step 1 - Launch browser and maximize Orange HRM");
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Reporter.log("Step 2 - Enter username/password and click Login button");
		
		
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
