package com.frameworkpractise.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.frameworkpractise.base.BasePageObjects;

public class LoginPage extends BasePageObjects {

	// private WebDriver driver;
	@FindBy(xpath = "//*[@id='content']/ul/li[21]/a")
	WebElement FormAuentication;

	@FindBy(xpath = "//*[@name='username']")
	WebElement userNameElement;

	@FindBy(xpath = "//*[@name='password']")
	WebElement passwordElement;

	@FindBy(xpath = "//*[@class='radius']")
	WebElement loginButton;

	@FindBy(xpath="//*[contains(text(),'Login Page')]")
	WebElement expectedText;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// clicked on the Form Auenth=ication link from main page
	public WebDriver FormAuentication() {
		FormAuentication.click();
		return driver;
	}

	// provide the user name
	public String userName(String username) {
		userNameElement.sendKeys(username);
		return username;
	}

	// provide the password
	public String password(String password) {
		passwordElement.sendKeys(password);
		return password;
	}

	// click on login button
	public WebElement loginButton() {
		return loginButton;
	}
	
	// valudate the text after landing to the auentication page
	public WebElement expText() {
		return expectedText;
	}
}