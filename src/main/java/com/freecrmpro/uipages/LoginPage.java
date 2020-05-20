package com.freecrmpro.uipages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrmpro.base.Testbase;

public class LoginPage extends Testbase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	@CacheLookup
	WebElement userName;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath ="//input[@type = 'submit']")
	@CacheLookup
	WebElement login;
	
	public void Login(String un, String pwd){
		userName.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
	}

}
