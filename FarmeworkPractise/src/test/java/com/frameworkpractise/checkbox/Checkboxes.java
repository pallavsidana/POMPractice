package com.frameworkpractise.checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.frameworkpractise.base.BasePageObjects;

public class Checkboxes extends BasePageObjects {

	// Click on the check box link
	@FindBy(xpath = "//*[contains(text(),'Checkboxes')]")
	WebElement cBoxes;
	public Checkboxes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void cbox() {
		System.out.println("3.1");
		cBoxes.click();
	}
}
