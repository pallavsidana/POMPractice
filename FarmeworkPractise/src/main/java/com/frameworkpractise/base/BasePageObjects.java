package com.frameworkpractise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	/*
	 * // click on an element with given locaton when it visible public static void
	 * clickOnButton(WebElement element) { element.click(); }
	 */
	
	//clickable method declared explicitly
	public static void clickOn(WebDriver driver, WebElement element, int timeout){
	new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
	// Expectedcondition for the element to be clickable
	element.click();
	}
	//send keys
	public static void enterText(WebElement element, String text){
        element.sendKeys(text);
    }
	}
