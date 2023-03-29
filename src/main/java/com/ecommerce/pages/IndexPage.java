package com.ecommerce.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ecommerce.helper.Helper;
import com.ecommerce.locators.CommonLocators;
import com.ecommerce.locators.IndexPageLocaters;

public class IndexPage extends IndexPageLocaters   {
	
	
	
	public IndexPage() {
		
		super();
		
		
	}
	
	
	Helper helper = new Helper();
	CommonLocators clocator = new CommonLocators();
	
	
	public String  ValidatePageTitle() {
		
	   return driver.getTitle();
	}
	
	
	public Login ClickonLoginLink()  {
		
	  helper.clickOnElement(MyAccount);
	  helper.clickOnElement(Login);
	Helper.ElementtoBeVisibleText(VerifyingLoginText, "I am a returning customer");
	
	return new Login();
		
	}
	
	public Register ClickonRegisterLink()  {
		
		 helper.clickOnElement(MyAccount);
		helper.clickOnElement(Register);
		Helper.ElementtoBeVisibleText(registerAccountText, "Register Account");
      	return new Register();
	}
	
	public boolean VerifyTitleText() {
		
		return helper.elementIsDisplayed(StoreText);
	}
	
	public SearchResultPage SearchProduct()  {
		
		helper.enterInTextbox(searchbox, "iphone");
		helper.clickOnElement(search_button);
		Helper.elementToBeVisibleWait(iphoneImage);
		return new SearchResultPage();
	}
	
	public ProductPage clickOnPcsLink() {
		
	helper.moveToElement(desktoplink);
	helper.clickOnElement(pclink);
	Helper.ElementtoBeVisibleText(pcText, "PC");
	return new ProductPage();
		
	}
	
	public ProductPage clickOnMacLink() {
		
		helper.moveToElement(desktoplink);
		helper.clickOnElement(maclink);
		Helper.ElementtoBeVisibleText(macText, "Mac");
		return new ProductPage();
	}
	
	public ProductPage clickOnWindowsLink() {
		
		helper.moveToElement(LaptopNotebooklink);
		helper.clickOnElement(windowsLink);
		return new ProductPage();
	}

	public Login clickOnWishListIcon() {
		
		helper.clickOnElement(wishlistlink);
		return new Login();
	}
	
	public String clickOnCartIcon() {
		
		helper.clickOnElement(ShoppingCartBtn);
		return helper.GetTextfromElement(ShoppingCartText);

	}
	
	
		
	
	
}
