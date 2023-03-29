package com.ecommerce.pages;

import com.ecommerce.helper.Helper;
import com.ecommerce.locators.SearchProductLocators;

public class SearchResultPage extends SearchProductLocators {
	
	Helper helper = new Helper();
	
	public SearchResultPage() {
		
		super();
	}
	
	public String getTitleOfPage() {
		
		
		return driver.getTitle();
	}
	
	public AddToCartPage addProducttoCart() {
		

		helper.clickOnElement(addtoCartformacbook);
		helper.clickOnElement(addtocartformacbookair);
		helper.clickOnElement(addtocartformacbookpro);
		helper.clickOnElement(shooppingcartlink);
		return new AddToCartPage();
	}
	
	public SearchResultPage navigateToListview() {
		
	helper.clickOnElement(listviewbutton);
	return new SearchResultPage();
		
	}

}
