package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class BooksPage extends PageObject {

	@FindBy(xpath = "//tr[2]/td[4]/input")
	WebElement txtJava;
	
	@FindBy(xpath = "//tr[3]/td[4]/input")
	WebElement txtRuby;
	
	@FindBy(xpath = "//tr[4]/td[4]/input")
	WebElement txtPython;
	
	@FindBy(xpath = "//div[@id='available']/input[1]")
	WebElement btnAdd;
	
	@FindBy(xpath = "//input[@id='total']")
	WebElement txtTotal;
	
	@FindBy(xpath = "//input[3]")
	WebElement btnLogout;
	
	public void addQuantityBooks(String java, String ruby, String python){
		txtJava.clear();
		txtJava.sendKeys(java);
		txtRuby.clear();
		txtRuby.sendKeys(ruby);
		txtPython.clear();
		txtPython.sendKeys(python);
		btnAdd.click();
	}
	
	public int getGrandTotal(){
		return Integer.parseInt(txtTotal.getAttribute("value"));
	}
	
	public void logout(){
		btnLogout.click();
	}	
	
}
