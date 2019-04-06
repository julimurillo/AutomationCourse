package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.elempleo.com/co")
public class SearchPage extends PageObject {

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
	WebElement txtSearch;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]")
	WebElement btnSugges;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input")
	WebElement btnCity;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]")
	WebElement txtCity;

	@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
	WebElement btnCookies;

	@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
	WebElement btnSearch;

	public void search(String search) {
		btnCookies.click();
		waitFor(btnSearch).isClickable();
		btnSearch.click();
		txtSearch.sendKeys(search);
		btnSugges.click();
		btnCity.click();
		txtCity.click();
	}

}
