package com.kingautomation.salesforce.testcases;


import java.io.IOException;
//import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.kingautomation.salesforce.util.Keywords;

public class LoginTest {

	
	/**
	 * Test for the Login page.
	 *
	 */
	
	Keywords session = Keywords.getInstance();
	
	// Precondition user is not already logged in
	@Test(dataProvider="getData")
	public void doIncorrectLogin(String username, String password, String browserName, String flag) throws IOException    { 

		System.out.println("Executing Login Test with username : " +username+ "& password: "+password );
		if(flag.equals("N"))
			throw new SkipException("Skipping as Flag is N");
		session.counter("browserInstance");
		session.openBrowser(browserName);
		session.navigate("testSiteURL");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");
		session.click("loginPageLink");
		Assert.assertTrue(session.validateTitle("loginPageTitle"), "Login page titles did not match");
		session.input("username", username);
		session.input("password", password);
		session.click("loginButton");
		System.out.println("Login Test sucessfull with username : " +username+ "& password: "+password);
		
	}


	@DataProvider
	public Object [] [] getData(){
		{
			Object data[] [] = new Object [4] [4];

			//1st Row
			data [0] [0] = "User1 ";
			data [0] [1] = "Passw1 ";
			data [0] [2] = "mozilla";
			data [0] [3] = "Y";
			
			//2nd Row
			data [1] [0] = "User2 ";
			data [1] [1] = "Pass2 ";
			data [1] [2] = "Chrome";
			data [1] [3] = "Y";	
			
			data [2] [0] = "User3";
			data [2] [1] = "Passw3 ";
			data [2] [2] = "mozilla";
			data [2] [3] = "Y";
			
			//2nd Row
			data [3] [0] = "User4";
			data [3] [1] = "Pass4";
			data [3] [2] = "Chrome";
			data [3] [3] = "Y";	
			
			return data;
		}

		
	}
	
	@AfterSuite
	public void CloseBrowser(){
		
		session.closeBroser();
		
	}
}

