package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//1.Declare PRivate Driver
	private WebDriver driver;
	//2.page constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3.By locators
	
	private By emailID=By.id("input-email");
	private By password=By.id("input-password");
	private By loginBtn= By.xpath("//input[@value='Login']");
	private By registerlink =By.linkText("Register");
	private By forgotPwdLink=By.linkText("Forgotten Password");
 	
	//4.Page Actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

}
