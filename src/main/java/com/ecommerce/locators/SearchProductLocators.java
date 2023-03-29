package com.ecommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class SearchProductLocators extends Base {
	
	public SearchProductLocators() {
		
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='button'])[10]")
	public WebElement addtoCartformacbook;
	
	@FindBy(xpath="(//button[@type='button'])[13]")
	public WebElement addtocartformacbookair;
	
	@FindBy(xpath="(//a[contains(text(),'MacBook Pro')])[2]")
	public WebElement addtocartformacbookpro;
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']")
	public WebElement shooppingcartlink;
	
	@FindBy(id="list-view")
	public WebElement listviewbutton;
	
	@FindBy(xpath="//a[normalize-space()='Your Store']")
	public WebElement yourStorebtn;

}
