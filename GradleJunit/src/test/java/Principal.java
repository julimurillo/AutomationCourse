import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Principal {

	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://sahitest.com/demo/training/login.htm");
	}

	@Test
	public void test() {
		Login pageLogin = new Login(driver);
		pageLogin.loginApp("test", "secret");
		Assert.assertTrue(pageLogin.validateLoginTrue());

	}
	
	@Test
	public void test2() {
		Login pageLogin = new Login(driver);
		pageLogin.loginApp("testd", "secretd");
		Assert.assertTrue(pageLogin.validateLoginFalse());

	}

	@After
	public void close() {
		driver.close();
	}

}
