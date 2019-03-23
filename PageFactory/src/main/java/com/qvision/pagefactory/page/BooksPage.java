package com.qvision.pagefactory.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage {
	
	@FindBy(xpath="//div[@id='available']/h2")
	WebElement lblMensaje;
	
	@FindBy(xpath="//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input")
	WebElement campo1;
	
	@FindBy(xpath="//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input")
	WebElement campo2;
	
	@FindBy(xpath="//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input")
	WebElement campo3;
	
	@FindBy(xpath="//*[@id=\"available\"]/input[1]")
	 WebElement btnAdd;
	
	@FindBy(xpath="//*[@id=\"total\"]")
	WebElement resultado;
	
	
	public boolean validarLbl() {
		
		boolean isVisible=false;
		
		try {
			if(lblMensaje.isDisplayed()) {
				isVisible=true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return isVisible;
		
	}
	
	
	public void llenarCampos(String valor1,String valor2,String valor3) {
		campo1.clear();
		campo2.clear();
		campo3.clear();
		campo1.sendKeys(valor1);
		campo2.sendKeys(valor2);
		campo3.sendKeys(valor3);		
		btnAdd.click();
	}
	
	public String ObtenerValor() {
		
		String valor= resultado.getAttribute("value");
		return valor;
		
	}


}
