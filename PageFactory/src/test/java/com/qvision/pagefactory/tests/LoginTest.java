package com.qvision.pagefactory.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qvision.pagefactory.page.BooksPage;
import com.qvision.pagefactory.page.LoginPage;


public class LoginTest {

	WebDriver driver;
	LoginPage pageLogin;
	BooksPage pageBook;
	
	@Before
	public void cargarDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
		pageLogin = PageFactory.initElements(driver,LoginPage.class);
		pageBook = PageFactory.initElements(driver,BooksPage.class);
	}
	
	@Test
	public void test() {
		pageLogin.iniciarSesion("test", "secret");
		assertTrue(pageBook.validarLbl());
	}
	
	
	@Test
	public void test2() {
		pageBook.llenarCampos("1", "1", "1");
		assertEquals("850", pageBook.ObtenerValor());
	}
	
	
	@After
	public void cerrarDriver() {
		driver.close();
		driver.quit();
	}
}
