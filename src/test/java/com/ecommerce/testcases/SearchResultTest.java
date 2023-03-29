package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.Base;
import com.ecommerce.pages.AddToCartPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.pages.SearchResultPage;
import com.ecommerce.pages.WishListPage;

public class SearchResultTest extends Base {
	IndexPage index;
	Login login;
	HomePage home;
	SoftAssert sf;
	ProductPage product;
	WishListPage wishlist;
	SearchResultPage search;
	AddToCartPage cart;
	
	public SearchResultTest() {
		
		super();
	}
	
	@BeforeMethod
	public void startUp() {
		
		intialisation();
		index= new IndexPage();
		login= new Login();
		login=index.ClickonLoginLink();
		home= new HomePage();
		home=login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		sf= new SoftAssert();
		product= new ProductPage();
		wishlist = new WishListPage();
		search= new SearchResultPage();
		cart= new AddToCartPage();
		search=home.SearchProduct();
	}
	
	@Test(priority=1)
	public void clickOnAddtoCartTest() {
		
		cart=search.addProducttoCart();
	}
	
	@Test(priority=2)
	public void clickOnListViewButtonTest() {
		
		search=search.navigateToListview();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
