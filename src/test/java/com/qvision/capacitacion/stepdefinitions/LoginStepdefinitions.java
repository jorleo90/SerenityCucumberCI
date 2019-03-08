package com.qvision.capacitacion.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qvision.capacitacion.steps.LoginStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefinitions {
	
	@Steps
	LoginStep stepLogin;

	@Given("^That i am in the login page$")
	public void thatIAmInTheLoginPage() {
	    stepLogin.openUrl();
	}

	@When("^I type the data$")
	public void iTypeTheData(DataTable arg1) {
	    List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
	    String user = listData.get(0).get("user");
	    String password = listData.get(0).get("pass");
	    stepLogin.login(user, password);
	}

	@Then("^I enter the application$")
	public void iEnterTheApplication() {
	    Assert.assertFalse(stepLogin.validate());
	}
	
}
