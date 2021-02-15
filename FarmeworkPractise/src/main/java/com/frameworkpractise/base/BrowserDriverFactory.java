package com.frameworkpractise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverFactory extends BaseTest {

	// private WebDriver driver;
	private String browser;

	public BrowserDriverFactory(String browser) {

		this.browser = browser.toLowerCase();
	}

	public WebDriver createDriver() {

		System.out.println("Create driver " + browser);

		switch (browser) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\pallav\\Selenium\\chrome-88\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver",
					"C:\\pallav\\Selenium\\chrome-88\\chromedriver_win32\\firefox.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver",
					"C:\\pallav\\Selenium\\chrome-88\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}

		return driver;
	}
}
