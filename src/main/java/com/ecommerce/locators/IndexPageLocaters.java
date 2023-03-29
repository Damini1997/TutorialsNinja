package com.ecommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class IndexPageLocaters extends Base {

	public IndexPageLocaters() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="search")
	public WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	public WebElement search_button;
	
	@FindBy(xpath="//a[@title='My Account']")
	public WebElement MyAccount;
	
	@FindBy(xpath="//a[text()='Register']")
	public WebElement Register;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement Login;
	
	@FindBy(xpath="//a[@title='Shopping Cart']")
	public WebElement ShoppingCartBtn;
	
	@FindBy(xpath="//span[normalize-space()='Checkout']")
	public WebElement checkoutlink;
	
	@FindBy(id="wishlist-total")
	public WebElement wishlistlink;
	
	@FindBy(xpath="//span[normalize-space()='123456789']")
	public WebElement phone;
	
	@FindBy(xpath="//span[normalize-space()='Currency']")
	public WebElement currencydropdown;
	
	@FindBy(xpath="//a[text()='Your Store']")
	public WebElement StoreText;
	
	@FindBy(xpath="//strong[normalize-space()='I am a returning customer']")
	public WebElement VerifyingLoginText;
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']")
	public WebElement registerAccountText;
	
	@FindBy(xpath="//img[@title='iPhone']")
	public WebElement iphoneImage;
	
	@FindBy(xpath="//a[text()='Desktops']")
	public WebElement desktoplink;
	
	@FindBy(xpath="//a[text()='PC (0)']")
	public WebElement pclink;
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	public WebElement maclink;
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	public WebElement LaptopNotebooklink;
	
	@FindBy(xpath="//a[text()='Macs (0)']")
	public WebElement macslink;
	
	@FindBy(xpath="//a[text()='Windows (0)']")
	public WebElement windowsLink;
	
	@FindBy(xpath="//div[@id='content']")
    public WebElement ShoppingCartText;
	
	@FindBy(xpath="(//h2[normalize-space()='PC'])[1]")
	public WebElement pcText;
	
	@FindBy(xpath="(//h2[normalize-space()='Mac'])[1]")
	public WebElement macText;
}
