package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class BooksPage extends PageObject {

	@FindBy(xpath = "//div[@id='available']//h2")
	WebElement Label;

	public boolean validateTitle() {
		return Label.isDisplayed();

	}
}
