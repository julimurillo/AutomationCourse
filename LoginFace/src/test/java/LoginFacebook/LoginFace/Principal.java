package LoginFacebook.LoginFace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Principal {

	WebDriver driver;
	File datos = new File("datos.txt");
	FileReader fr;
	ArrayList<String> info= new ArrayList<String>();

	@Before
	public void Driver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

    @Before
	public void leerArchivo() {

		try {
			fr = new FileReader(datos);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while ((linea = br.readLine()) != null) {
				info.add(linea);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void test() {
		Login pageLogin = new Login(driver);
		Validacion validate = new Validacion(driver);
		pageLogin.loginApp(info.get(0), info.get(1));
		Assert.assertTrue(validate.validateLoginTrue());
	}

	@Test
	public void test2() {
		Login pageLogin = new Login(driver);
		Validacion validate = new Validacion(driver);
		pageLogin.loginApp(info.get(2), info.get(3));
		Assert.assertTrue(validate.validateLoginFalse());
	}

	@After
	public void close() {
		driver.close();
	}

}
