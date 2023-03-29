package com.ecommerce.pages;

import com.ecommerce.helper.Helper;
import com.ecommerce.locators.HomePageLocators;

public class HomePage extends HomePageLocators {
	
	Helper helper = new Helper();
	
	public HomePage() {
		
		super();
	}
	
	public String getTitleofPage() {
		
		return driver.getTitle();
	}
	
	public ProductPage clickOnProduct() {
		
		helper.clickOnElement(yourStorebtn);
		helper.scrollintoView(macbookProduct);
		helper.clickOnElement(macbookProduct);
		//Helper.elementToBeVisibleWait(macbookText);
		return new ProductPage();
		
	}
	
	public ProductPage clickOnBannerImage() {
	
	helper.clickOnElement(yourStorebtn);	
	helper.clickOnElement(iphoneProduct);
  //  Helper.elementToBeVisibleWait(iphoneText);  
	return new ProductPage();
	}
	
	
	public WishListPage clickOnWishlist() {
		
		helper.clickOnElement(yourStorebtn);
		helper.clickOnElement(wishListIcon);
		helper.clickOnElement(wishlistlink);
	//	Helper.elementToBeVisibleWait(wishlistText);
		return new WishListPage();
	}
	
	public String getCurrentUrl() {
		
		String homePageUrl=driver.getCurrentUrl();
		return homePageUrl; 
	}
	
	public SearchResultPage SearchProduct() {
		
		helper.clickOnElement(yourStorebtn);
		helper.enterInTextbox(searchBox, "macbook");
		helper.clickOnElement(search_button);
		helper.elementIsDisplayed(macbookimg);
		return new SearchResultPage();
	}

}
