

package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.Base;
import com.ecommerce.pages.ForgotPasswordPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.Register;

public class LoginPageTest  extends Base {
	
	IndexPage index;
	Login login;
	SoftAssert sf;
	HomePage home;
	ForgotPasswordPage forgotpass;
	Register register;
	
	public LoginPageTest() {
		
		super();
	}
	
	
	@BeforeMethod
	public void startUp() throws InterruptedException {
		
		intialisation();
		index= new IndexPage();
		login= new Login();
		login=index.ClickonLoginLink();
		register= new Register();
		sf= new SoftAssert();
	}
	
	@Test(priority=1)
	public void getTitleTest() {
		
		String TitleofPage=login.getTitleofPage();
		String ExpectedTitle="Your Store";
		sf.assertEquals(TitleofPage, ExpectedTitle,"TITLE NOT MATCHED");
	}
	
	@Test(priority=2)
	public void doLoginTest() {
		
		home=login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=3)
	public void clickOnForgotPasswordLink() {
		
		forgotpass=login.clickOnForgotPasswordLink();
	}
	
	@Test(priority=4)
	public void clickOnCustomerlinkTest() {
		
		register=login.clickOnRegistrationpagelink();
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
