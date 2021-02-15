package com.frameworkpractise.Controller;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.frameworkpractise.base.BasePageObjects;
import com.frameworkpractise.base.TestUtilities;
import com.frameworkpractise.checkbox.Checkboxes;
import com.frameworkpractise.pom.pages.LoginPage;
import com.frameworkpractise.pom.pages.WelcomePage;

import net.bytebuddy.asm.Advice.Enter;;

public class Controller extends TestUtilities {
	
	@Parameters({ "url", "usrname", "pwd" })
//	@Test(groups = "SmokeTest")
	public void OpenPageTest(String url, String usrname, String pwd) {
		System.out.println("starting to open the page");
		BasePageObjects obj2 = new BasePageObjects(driver);
		// get url
		obj2.openUrl(url);
		System.out.println("Create driver " + url);
		sleep(6000);
		LoginPage lpObj = new LoginPage(driver);
		lpObj.FormAuentication();
		// provide the username ad password and click on login button on the login page
		String actualText="Login Page";
		String ExpectedText=lpObj.expText().getText();
		System.out.println(ExpectedText);
		Assert.assertTrue(actualText.matches(ExpectedText));
		lpObj.userName(usrname);
		lpObj.password(pwd);
		obj2.clickOnButton(lpObj.loginButton());
		
	}
	@Parameters({ "url", "usrname", "pwd" })
	@Test(groups = "SmokeTest")
	public void CheckBoxesTwoCheckboxesTest(String url, String usrname, String pwd) {
		// open the main page
		BasePageObjects obj = new BasePageObjects(driver);
		obj.openUrl(url);
		System.out.println("Create driver " + url);
		sleep(6000);

		System.out.println("2");
		
		//click on the check box link
		Checkboxes cObj = new Checkboxes(driver);

		System.out.println("3");
		cObj.cbox();

		System.out.println("4");
		//select all the checkboxes
		//verify all the checkboxes are clicked
		
	}
}
