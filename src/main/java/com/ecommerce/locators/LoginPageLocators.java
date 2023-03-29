package com.ecommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class LoginPageLocators extends Base {
	
	public LoginPageLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="email")
	public WebElement Email;
	
	@FindBy(id="input-password")
	public WebElement Ipassword;
	
	@FindBy(xpath="(//a[text()='Forgotten Password'])[1]")
	public WebElement forgotpasswordlink;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	public WebElement ErrorMessageText;
	
	@FindBy(xpath="(//a[normalize-space()='Account'])[1]")
	public WebElement accountlink;
	
	@FindBy(xpath="(//h1[normalize-space()='Forgot Your Password?'])[1]")
	public WebElement forgotpasswordText;
	
	@FindBy(xpath="(//a[normalize-space()='Continue'])[1]")
	public WebElement registerlink;
	
	@FindBy(xpath="(//h1[normalize-space()='Register Account'])[1]")
	public WebElement regsitrationText;
	

}
