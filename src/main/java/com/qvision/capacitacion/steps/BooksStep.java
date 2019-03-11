package com.qvision.capacitacion.steps;

import org.junit.Assert;

import com.qvision.capacitacion.pages.BooksPage;
import com.qvision.capacitacion.pages.LoginPage;

public class BooksStep {

	LoginPage pageLogin;
	BooksPage pageBooks;
	
	public void login(String user, String password){
		pageLogin.open();
		pageLogin.login(user, password);
	}
	
	public void typeQuantityBooks(String java, String ruby, String python){
		pageBooks.addQuantityBooks(java, ruby, python);
	}
	
	public int validateGrandTotal(){
		return pageBooks.getGrandTotal();
	}
	
}
