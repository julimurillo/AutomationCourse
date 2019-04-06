package com.qvision.capacitacion.steps;

import java.io.IOException;

import com.qvision.capacitacion.pages.ResultsPage;
import com.qvision.capacitacion.pages.SearchPage;

import net.thucydides.core.annotations.Step;

public class SearchSteps {
	
 SearchPage searchs;
 ResultsPage results;
 
 @Step
	public void openurl() {
		searchs.open();
	}
	
	@Step
	public void search(String search) {
		searchs.search(search);
	}
	
	@Step
	public void filters() {
		results.filters();
	}
	
	@Step
	public void readOfferts() throws IOException {
		results.readOfferts();
	}
	
	@Step
	public void screenshot() {
		results.screenshot();
	}
	
	@Step
	public boolean validate() {
		return results.validate();		
	}
	
	
	
}
