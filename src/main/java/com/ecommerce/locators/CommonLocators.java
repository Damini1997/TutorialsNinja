package com.ecommerce.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.base.Base;

public class CommonLocators extends Base {

	public CommonLocators() {
		
		PageFactory.initElements(driver, this);
		
	}
	
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
	
	
}
