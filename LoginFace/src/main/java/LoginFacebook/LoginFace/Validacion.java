package LoginFacebook.LoginFace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Validacion {

	WebDriver myDriver;
	WebElement message;
	String actualmessage;
	public Validacion(WebDriver driver) {

		this.myDriver = driver;
	}
	
	
	public boolean validateLoginTrue() {

		boolean result = true;
   try {
	Thread.sleep(5000);
	message = myDriver.findElement(By.id("u_0_c"));
	
	if (message.isDisplayed()) {
		result = true;
	}
} catch (InterruptedException e) {
	
}
		

		return result;
	}
	
	public boolean validateLoginFalse() {

		boolean result = false;
   try {
	Thread.sleep(2000);
	message = myDriver.findElement(By.id("pass"));
	if (message.isDisplayed()) {
		result = true;
	}
} catch (InterruptedException e) {
	result= false;
}
		

		return result;
	}
}
