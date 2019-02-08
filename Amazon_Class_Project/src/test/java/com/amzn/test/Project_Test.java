package com.amzn.test;

import org.testng.annotations.Test;

import com.amzn.main.Homepage;

public class Project_Test extends Browser{
	@Test
	public void runProject() throws InterruptedException{
		Homepage homepage = new Homepage(driver);
		
		homepage.clickOnMenu();
		Thread.sleep(2000);
		homepage.compareMenu();
	}
}
