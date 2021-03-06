import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver myDriver;
	WebElement txtName;
	WebElement txtPasswd;
	WebElement btnLogin;
	WebElement message;

	public Login(WebDriver driver) {

		this.myDriver = driver;

	}

	public void loginApp(String user, String passwd) {
		txtName = myDriver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[1]/td[2]/input"));
		txtName.sendKeys(user);
		txtPasswd = myDriver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[2]/td[2]/input"));
		txtPasswd.sendKeys(passwd);
		btnLogin = myDriver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
		btnLogin.click();

	}

	public boolean validateLoginTrue() {

		boolean result = false;
   try {
	Thread.sleep(2000);
	message = myDriver.findElement(By.xpath("//*[@id=\"available\"]/h2"));
	if (message.isDisplayed()) {
		result = true;
	}
} catch (InterruptedException e) {
	result= false;
}
		

		return result;
	}
	
	public boolean validateLoginFalse() {

		boolean result = false;
   try {
	Thread.sleep(2000);
	message = myDriver.findElement(By.xpath("//*[@id=\"errorMessage\"]"));
	if (message.isDisplayed()) {
		result = true;
	}
} catch (InterruptedException e) {
	result= false;
}
		

		return result;
	}

}
