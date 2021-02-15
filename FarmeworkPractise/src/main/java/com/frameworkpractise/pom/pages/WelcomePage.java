package com.frameworkpractise.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.frameworkpractise.base.BasePageObjects;

public class WelcomePage extends BasePageObjects {

	@FindBy(xpath = "//*[@id='content']/ul/li[21]/a")
	WebElement FormAuenticationLink;
	
	public WelcomePage(WebDriver driver) {
		super(driver);

	}

	// clicked on the Form Auenth=ication link from main page

	// clicked on the Form Auenth=ication link from main page
	public WebDriver FormAuentication() {
		FormAuenticationLink.click();
		return driver;
	}

}
