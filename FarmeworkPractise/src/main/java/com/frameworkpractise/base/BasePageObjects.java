package com.frameworkpractise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageObjects extends TestUtilities {

	protected static WebDriver driver;
	protected String browser;

	public BasePageObjects(WebDriver driver) {
		this.driver = driver;

	}
// open url
	public static void openUrl(String url) {
		driver.get(url);
	}
	// click on an element  with given  locaton when  it visible
	public static void clickOnButton(WebElement element) {
		element.click();
	}
	//send keys
	public static void enterText(WebElement element, String text){
        element.sendKeys(text);
    }
	}
