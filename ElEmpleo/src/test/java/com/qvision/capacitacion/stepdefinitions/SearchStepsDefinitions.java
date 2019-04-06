package com.qvision.capacitacion.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.qvision.capacitacion.steps.SearchSteps;


import net.thucydides.core.annotations.Steps;
public class SearchStepsDefinitions {

	@Steps
	SearchSteps stepPrincipal;
	
	@Given("^I want to find jobs with a keyword$")
	public void iWantToFindJobsWithAKeyword() {
	   
		stepPrincipal.openurl();
		
	}

	@When("^I search for jobs containing contador$")
	public void iSearchForJobsContainingContador() {
	    
		stepPrincipal.search("cont");
		
	}

	@Then("^I should only see items related to contador")
	public void iShouldOnlySeeItemsRelatedToContador() {
		assertTrue(stepPrincipal.validate());
		stepPrincipal.filters();	
		stepPrincipal.screenshot();
		
	}
	
	@Then("^save this in a \\.txt file$")
	public void saveThisInATxtFile() throws IOException {
		stepPrincipal.readOfferts();
	}
}
