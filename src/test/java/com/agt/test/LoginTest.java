package com.agt.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void positiveLoginTest() {
		System.out.println("LoginTest.positiveLoginTest()");
	}

	@Test
	public void negativeTest() {
		System.out.println("LoginTest.negativeTest()");
	}

	/*@Test
	public void failedTest() {
		
		Assert.assertTrue(false);
	}*/

	@Test
	public void skipTest() {
		
		new SkipException("Test skipped");
	}
	
	
	
	
	
}
