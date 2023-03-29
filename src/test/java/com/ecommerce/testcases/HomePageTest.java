package com.ecommerce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecommerce.base.Base;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.IndexPage;
import com.ecommerce.pages.Login;
import com.ecommerce.pages.ProductPage;
import com.ecommerce.pages.SearchResultPage;
import com.ecommerce.pages.WishListPage;

public class HomePageTest extends Base {
	
	IndexPage index;
	Login login;
	HomePage home;
	SoftAssert sf;
	ProductPage product;
	WishListPage wishlist;
	SearchResultPage search;
	
	public HomePageTest() {
		
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
	}
	
	@Test(priority=1)
	public void getTitleofPageTest() {
		
		String TitlePage= home.getTitleofPage();
		String ExpectedTitle="Your Store";
		sf.assertEquals(TitlePage, ExpectedTitle);
		}
	
	@Test(priority=2)
	public void clickOnProductTest() {
		
		product=home.clickOnProduct();
		
	}
	
	@Test(priority=3)
	public void clickOnBannerImageTest() {
		
		product=home.clickOnBannerImage();
	}
	
	@Test(priority=4)
	public void verifyCurrentUrlTest() {
		
		String CurrentUrl=home.getCurrentUrl();
		String ExpectedUrl="http://tutorialsninja.com/demo/index.php?route=common/home";
		sf.assertEquals(CurrentUrl, ExpectedUrl,"Url not matched!!");
	}
	
	@Test(priority=5)
	public void wishListTest() {
		
		wishlist=home.clickOnWishlist();
	}
	
	@Test(priority=6)

	public void searchProductTest() {
		
		search=home.SearchProduct();
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	

}
