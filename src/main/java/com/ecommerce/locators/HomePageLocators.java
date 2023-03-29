package com.ecommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class HomePageLocators extends Base {
	
	public HomePageLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[contains(text(),'MacBook')])[2]")
	public WebElement macbookProduct;
	
	@FindBy(xpath="(//img[@alt='iPhone 6'])[1]")
   public WebElement iphoneProduct;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	public WebElement wishListIcon;
	
	@FindBy(xpath="(//input[@placeholder='Search'])[1]")
	public WebElement searchBox;
	
	@FindBy(xpath="(//button[@class='btn btn-default btn-lg'])[1]")
	public WebElement search_button;
	
	@FindBy(xpath="//a[normalize-space()='wish list']")
	public WebElement wishlistlink;
	
	@FindBy(xpath="//h1[normalize-space()='iPhone']")
	public WebElement iphoneText;
	
	@FindBy(xpath="(//h1[normalize-space()='MacBook'])[1]")
	public WebElement macbookText;
	
	@FindBy(xpath="(//h2[normalize-space()='My Wish List'])[1]")
	public WebElement wishlistText;
	
	@FindBy(xpath="//a[normalize-space()='Your Store']")
	public WebElement yourStorebtn;
	
	@FindBy(xpath="//div[@class='image']//img[@title='MacBook']")
	public WebElement macbookimg;
	
}
