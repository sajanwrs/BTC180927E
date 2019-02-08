package com.amzn.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser {
	ChromeDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
