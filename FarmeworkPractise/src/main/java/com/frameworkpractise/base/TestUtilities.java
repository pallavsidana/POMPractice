package com.frameworkpractise.base;

public class TestUtilities extends BaseTest {

	// Static sleep
	protected void sleep(long mili) {
		try {
			Thread.sleep(mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
