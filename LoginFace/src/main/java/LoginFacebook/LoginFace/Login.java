package LoginFacebook.LoginFace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver myDriver;

	WebElement txtName;
	WebElement txtPasswd;
	WebElement btnLogin;
	

	public Login(WebDriver driver) {

		this.myDriver = driver;
	}

	public void loginApp(String user, String passwd) {
		txtName = myDriver.findElement(By.id("email"));
		txtName.sendKeys(user);
		txtPasswd = myDriver.findElement(By.id("pass"));
		txtPasswd.sendKeys(passwd);
		btnLogin = myDriver.findElement(By.id("u_0_2"));
		btnLogin.click();

	}
}
