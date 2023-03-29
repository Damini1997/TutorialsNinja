package com.ecommerce.helper;

import com.ecommerce.InterFacePackage.IcommonMethods;
import com.ecommerce.locators.CommonLocators;

public class CommonMethods extends CommonLocators implements  IcommonMethods{

	Helper helper = new Helper();
	
	@Override
	public void SearchparticularProduct() {
		
	
		
	}

	
	@Override
	public void goToPcSubMenu() {
		
	helper.moveToElement(desktoplink);
	helper.clickOnElement(pclink);
	
	}

	@Override
	public void goToMacSubMenu() {
		helper.moveToElement(desktoplink);
		helper.clickOnElement(maclink);
	}

	@Override
	public void goToMacsSubMenu() {

		helper.moveToElement(LaptopNotebooklink);
		helper.clickOnElement(macslink);
	}

	@Override
	public void goToWindowsmenu() {
		
		helper.moveToElement(LaptopNotebooklink);
		helper.clickOnElement(windowsLink);
		
	}

}
