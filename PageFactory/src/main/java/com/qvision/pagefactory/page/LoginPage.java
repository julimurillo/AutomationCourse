package com.qvision.pagefactory.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
  @FindBy(name="user")
	WebElement txtUsuario;
  
  @FindBy(name="password")
  WebElement txtPass;
  
  @FindBy(xpath="/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
  WebElement btnLogin;
  
  @FindBy(xpath="/html/body/center/div/a")
  WebElement Register;
  
  public void iniciarSesion(String usuario, String password) {
	  
	  txtUsuario.sendKeys(usuario);
	  txtPass.sendKeys(password);
	  btnLogin.click();
  }
	
  
  public void Registrarse() {
	  
	  Register.click();
  }

}
