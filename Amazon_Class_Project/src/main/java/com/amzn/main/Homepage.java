package com.amzn.main;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	ChromeDriver driver;
	
	String [] expected = {"Prime Video","Amazon Music", "Echo & Alexa","Fire Tablets","Fire TV","Kindle E-readers & Books",
			"Appstore for Android"};
	
	
	Methods method = new Methods();
	
	public Homepage(ChromeDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='nav-hamburger-menu']") WebElement menu;
	@FindBy(xpath=".//*[@id='hmenu-content']/ul[33]/li/a/div") List<WebElement> submenu;
	
	String [] menuNames = new String[submenu.size()];
	
	public void clickOnMenu(){
		method.click(menu);
	}
		
	public void compareMenu(){
		
		try{
			
			int i=0;
			for(WebElement e: submenu){
				menuNames[i] = e.getText().trim();
				i++;
			}
			for(int j=0; j<=menuNames.length; j++){
				if(expected[j] == menuNames[j])
					System.out.println("Test case passed");
				else
					System.out.println("Test case failed");
			}
			
		}
		catch(Exception e){
			
		}
	}
	
	public void getAttribute(){
		
	}
	
}
