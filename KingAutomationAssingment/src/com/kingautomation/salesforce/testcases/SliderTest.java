package com.kingautomation.salesforce.testcases;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kingautomation.salesforce.util.Keywords;

public class SliderTest {
	
	/**
	 *
	 *Test of the Flex slider in Home page
	 * @throws MalformedURLException 
	 *
	 */

	@Test
	public void FlexSliderTest() throws InterruptedException, MalformedURLException{

		
		Keywords session = Keywords.getInstance();
		System.out.println("--------------Executing Slider test----------");
		System.out.println("---------------------------------------------");
		session.openBrowser("mozilla");
		session.counter("browserInstance");
		session.navigate("testSiteURL");
		
		//Slider number 1
		session.click("sliderControlOne");
		Assert.assertTrue(session.validateText("sliderTitle_1", "sliderControlOneText"));	
	
		
		//Slider number 2
		session.waitUntilElementClickable("sliderControlTwo");
		session.click("sliderControlTwo"); 
		session.waitUntilElementFound("sliderControlTwoText");
		Assert.assertTrue(session.validateText("sliderTitle_2", "sliderControlTwoText"));
		
		//Slider number 3
		session.waitUntilElementClickable("sliderControlThree");
		session.click("sliderControlThree");
		session.waitUntilElementFound("sliderControlThreeText");
		Assert.assertTrue(session.validateText("sliderTitle_3", "sliderControlThreeText"));
		
		//Slider number 4
		session.waitUntilElementClickable("sliderControlFour");
		session.click("sliderControlFour");
		session.waitUntilElementFound("sliderControlFourText");
		Assert.assertTrue(session.validateText("sliderTitle_4", "sliderControlFourText"));



	}

}
