package com.qvision.capacitacion.stepdefinitions;

import org.junit.Assert;

import com.qvision.capacitacion.steps.BooksStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BooksStepdefinitions {
	
	@Steps
	BooksStep stepBook;

	@Given("^I am in the buy books section$")
	public void iAmInTheBuyBooksSection() {
	    stepBook.login("test", "secret");
	}

	@When("^I type the quantity for every book$")
	public void iTypeTheQuantityForEveryBook() {
	    stepBook.typeQuantityBooks("1", "1", "1");
	}

	@Then("^I validate the grand total$")
	public void iValidateTheGrandTotal() {
	    Assert.assertEquals(850, stepBook.validateGrandTotal());
	}
	
}
