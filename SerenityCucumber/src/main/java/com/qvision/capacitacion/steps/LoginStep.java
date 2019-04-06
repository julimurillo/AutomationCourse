package com.qvision.capacitacion.steps;

import com.qvision.capacitacion.pages.BooksPage;
import com.qvision.capacitacion.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginStep {
	LoginPage pageLogin;
	BooksPage pageBook;

	@Step
	public void openApp() {
		pageLogin.open();
	}

	@Step
	public void typeData(String user, String password) {
		pageLogin.iniciarSesion(user, password);
	}

	@Step
	public boolean validateLogin() {
		return pageBook.validateTitle();
	}
}
