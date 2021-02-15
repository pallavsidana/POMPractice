package com.frameworkpractise.dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.frameworkpractise.base.TestUtilities;




public class DragandDrop extends TestUtilities{
	
	
	@Parameters("urldragdrop")
	@Test(groups="R")
	public void LoginTest(String urldragdrop) {
	
		//get url
		System.out.println("Create driver "+urldragdrop);
		driver.get(urldragdrop);
		System.out.println("main page is opened");
		sleep(10000);
		WebElement from=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, To).build().perform();
		
		
}
}
