package com.freecrmpro.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrmpro.base.Testbase;
import com.freecrmpro.uipages.LoginPage;

public class LoginTest extends Testbase{
	
	LoginPage loginpage = new LoginPage();

	public LoginTest() throws FileNotFoundException, IOException {
		super();
	}
	
	@BeforeMethod
	public void setup(){
		invokebrowser();
	}
	
	@Test
	public void LoginPageTest(){
		loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@AfterMethod
	public void Teardown(){
		driver.quit();
	}
	
}	