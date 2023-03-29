package com.ecommerce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.Base;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.pages.Register;
import com.ecommerce.pages.SearchResultPage;

public class IndexPageTest extends Base  {
	IndexPage index;
	SoftAssert sf;
	Login login;
	Register register;
	SearchResultPage search;
	ProductPage product;
	
	public IndexPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void startUp() {
		
		intialisation();
		index= new IndexPage();
		sf= new SoftAssert();
		login= new Login();
		register = new Register();
	   product = new ProductPage();	
		
	
	}
	
	@Test(priority=1)
	public void ValidateTitleTest() {
		
		String IndexTitle=index.ValidatePageTitle();
		String ExpectedTitle="Your Store";
		sf.assertEquals(IndexTitle, ExpectedTitle,"Title not matched!");
	}
	
	@Test(priority=2)
	public void clickOnLoginLinkTest()  {
		
		login=index.ClickonLoginLink();
	    
		
	}
	
	@Test(priority=3)
	public void clickOnRegisterlinkTest()  {
		
		register=index.ClickonRegisterLink();
	}
	
	@Test(priority=4) 
	public void verifyTitleTextTest() {
		
		boolean flag=index.VerifyTitleText();
	    sf.assertTrue(flag, "Title text not matched");
	}
	
	@Test(priority=5) 
	public void searchResultPageTest()  {
		
		search=index.SearchProduct();
	}
	
	@Test(priority=6) 
	public void clickOnPclinkTest() {
		
		product=index.clickOnPcsLink();
	}
	
	@Test(priority=7)
	public void clickOnMaclinkTest() {
		
		product=index.clickOnMacLink();
	}
	
	@Test(priority=8)
	public void clickOnWindowlinkTest() {
		
		product=index.clickOnWindowsLink();
	}
	
	@Test(priority=9)
	public void clickOnWishlistIconTest() {
		
		login=index.clickOnWishListIcon();
	}
	
	@Test(priority=10)
	public void clickOnCartIconTest() {
		
		String iconText=index.clickOnCartIcon();
		String ExpectedText="Your shopping cart is empty!";
		Assert.assertEquals(iconText, ExpectedText);
	}

	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
