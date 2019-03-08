package com.qvision.capacitacion.steps;

import com.qvision.capacitacion.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {

	LoginPage pageLogin;
	
	@Step
	public void openUrl(){
		pageLogin.open();
	}
	
	@Step
	public void login(String user, String password){
		pageLogin.login(user, password);
	}
	
	@Step
	public boolean validate(){
		return pageLogin.validateMessage();
	}
	
}
