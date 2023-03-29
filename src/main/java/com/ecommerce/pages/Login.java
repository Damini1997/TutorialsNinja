package com.ecommerce.pages;

import com.ecommerce.helper.Helper;
import com.ecommerce.locators.LoginPageLocators;

public class Login extends LoginPageLocators {
	
	Helper helper = new Helper();
	
	public Login() {
		
		super();
	}
	
	public String getTitleofPage() {
		
		return driver.getTitle();
		
	}
	
	public HomePage doLogin(String username ,String password) {
		
		helper.enterInTextbox(Email,username);
        helper.enterInTextbox(Ipassword, password);
        helper.clickOnElement(loginButton);
       helper.elementIsEnabled(accountlink);
        return new HomePage();
	}
	
	public ForgotPasswordPage clickOnForgotPasswordLink() {
		
		helper.clickOnElement(forgotpasswordlink);
		Helper.elementToBeVisibleWait(forgotpasswordText);
		return new ForgotPasswordPage();
	}
	
	public Register clickOnRegistrationpagelink() {
		
		helper.clickOnElement(registerlink);
		Helper.elementToBeVisibleWait(regsitrationText);
		return new Register();
	}
	
	

}
