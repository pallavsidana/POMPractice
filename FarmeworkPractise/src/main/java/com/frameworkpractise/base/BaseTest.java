package com.frameworkpractise.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.frameworkpractise.base.BrowserDriverFactory;

public class BaseTest {
	protected WebDriver driver;

	@Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	public void setUP(@Optional("chrome") String browser) {
		// create driver
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("Closing the browser");
		driver.quit();
	}
}
