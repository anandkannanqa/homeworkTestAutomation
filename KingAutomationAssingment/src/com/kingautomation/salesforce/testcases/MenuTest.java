package com.kingautomation.salesforce.testcases;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.kingautomation.salesforce.util.Keywords;

public class MenuTest {
	
	/**
	 * Test for the top menu in Home page
	 * @throws MalformedURLException 
	 * 
	 */
	
	@Test
	public void topMenuTest() throws MalformedURLException{
		

		Keywords session = Keywords.getInstance();
		System.out.println("-------------Executing Menu Test------------");
		System.out.println("--------------------------------------------");
		session.openBrowser("mozilla");
		session.counter("browserInstance");
		session.navigate("testSiteURL");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");

		session.click("indutryTab");
		session.waitUntilTitleIs("industryTabTitle");
		Assert.assertTrue(session.validateTitle("industryTabTitle"), "Industry page titles did not match");
		System.out.println("industryTabTest"); 
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");
		session.click("prodTab");
		session.waitUntilTitleIs("prodTabTitle");
		Assert.assertTrue(session.validateTitle("prodTabTitle"), "Prod page titles did not match");
		System.out.println("prodTabTest"); 
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");

		session.click("servicesTab");
		session.waitUntilTitleIs("servicesTabTitle");
		System.out.println("servicesTabTitleTest");
		Assert.assertTrue(session.validateTitle("servicesTabTitle"), "Service page titles did not match");
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");

		
		session.click("customersTab");
		session.waitUntilTitleIs("customersTabTitle");
		Assert.assertTrue(session.validateTitle("customersTabTitle"), "Customer page titles did not match");
		System.out.println("customersTabTest");
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");


		session.click("eventsTab");
		session.waitUntilTitleIs("eventsTabTitle");
		Assert.assertTrue(session.validateTitle("eventsTabTitle"), "events page titles did not match");
		System.out.println("eventsTabTest");
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");
		
		session.click("resourcesTab");
		if(Keywords.winIds.size() > 1){
			session.switchIfSubWindowAvailable();
		} //Handled switching of windows in its simplest form this can be further made more dynamic
		session.waitUntilTitleIs("resourcesTabTitle");
		Assert.assertTrue(session.validateTitle("resourcesTabTitle"), "Resource page titles did not match");
		System.out.println("resourcesTabTest");
		session.navigate("testSiteURL");
		session.waitUntilTitleIs("homePageTitle");
		Assert.assertTrue(session.validateTitle("homePageTitle"), "Home page titles did not match");
		
		session.click("aboutUsTab");
		session.waitUntilTitleIs("aboutUsTabTitle");
		Assert.assertTrue(session.validateTitle("aboutUsTabTitle"), "AboutUs page titles did not match");
		System.out.println("aboutUsTabTest");
		
	}
	

}
