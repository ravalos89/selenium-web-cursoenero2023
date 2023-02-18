package com.orangehrm.qa;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Login {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@Test
	public void tc001LoginUser() {

		Reporter.log("Step 1 - Launch browser and maximize Orange HRM");
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		// Launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Reporter.log("Step 2 - Enter username/password and click Login button");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//name="username"
		//name="password"
		//type="submit"
		//img[@class='oxd-userdropdown-img']
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='client brand banner']")));
		
		Reporter.log("Step 3 - User is logged successfully");
		boolean profilePictureIsDisplayed = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
		Assert.assertEquals(profilePictureIsDisplayed, true);
		
		
	}
	
	@Test
	public void tc002LoginFailed() {

		Reporter.log("Step 1 - Launch browser and maximize Orange HRM");
		ChromeOptions chromeOpt = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOpt);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Reporter.log("Step 2 - Enter incorrect username or password and click Login button");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//name="username"
		//name="password"
		//type="submit"
		//img[@class='oxd-userdropdown-img']
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Reporter.log("Step 3 - Validate Login error message");
		boolean loginErrorMsgIsDisplayed = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']")).isDisplayed();
		//Assert.assertEquals(loginErrorMsgIsDisplayed, true); // Hard Assertion
		
		String actualLoginErrorMsg = driver.findElement(By.xpath("//p[contains(@class, 'content-text')]")).getText();
		//Assert.assertEquals(actualLoginErrorMsg, "Invalid credentials"); // HArd Assertion
		
		// SOFT ASSERTION
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(loginErrorMsgIsDisplayed, false);
		
		System.out.println("Soft Assertion 1");
		
		softAssertion.assertEquals(actualLoginErrorMsg, "Invalid Credentials");
		
		System.out.println("Soft Assertion 2");
		
		driver.close();
		
		softAssertion.assertAll();
		
		
	}
	
	//div[@class='orangehrm-login-error']
	//p[contains(@class, 'content-text')]

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
