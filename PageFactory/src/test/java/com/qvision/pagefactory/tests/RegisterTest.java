package com.qvision.pagefactory.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qvision.pagefactory.page.LoginPage;
import com.qvision.pagefactory.page.RegisterPage;

public class RegisterTest {

	WebDriver driver;
	LoginPage pageLogin;
	RegisterPage pageRegis;

	@Before
	public void cargarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		pageLogin = PageFactory.initElements(driver, LoginPage.class);
		pageRegis = PageFactory.initElements(driver, RegisterPage.class);
	}

	@Test
	public void test() {

		try {
			pageLogin.Registrarse();
			pageRegis.registro("juli", "juliM", "addr", "Badd", "Tamil Nadu", "M", "Can");
			assertEquals("Registered Successfully", pageRegis.checkAlert(driver));
		} catch (Exception e) {

		}

	}

	@After
	public void cerrarDriver() {
		driver.close();
		driver.quit();
	}
}
