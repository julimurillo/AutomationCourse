package com.qvision.capacitacion.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPage extends PageObject {

	@FindBy(name = "user")
	WebElement txtUsuario;

	@FindBy(name = "password")
	WebElement txtPass;

	@FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
	WebElement btnLogin;

	public void iniciarSesion(String usuario, String password) {

		txtUsuario.sendKeys(usuario);
		txtPass.sendKeys(password);
		btnLogin.click();
	}

}
