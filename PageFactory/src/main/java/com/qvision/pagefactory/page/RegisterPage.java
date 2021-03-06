package com.qvision.pagefactory.page;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	@FindBy(id = "uid")
	WebElement User;
	@FindBy(xpath = "//*[@id=\"pid\"]")
	WebElement Pass;
	@FindBy(xpath = "//*[@id=\"pid2\"]")
	WebElement Pass2;
	@FindBy(name = "gender")
	List<WebElement> Gender;
	//WebElement Gender;
	@FindBy(id = "taid")
	WebElement Addr;
	@FindBy(id = "btaid")
	WebElement BAddr;
	@FindBy(xpath = "/html/body/center/div/form/div/table/tbody/tr[7]/td[2]/select")
	WebElement State;
	@FindBy(xpath = "/html/body/center/div/form/input[1]")
	WebElement terms;
	@FindBy(xpath = "/html/body/center/div/form/input")
	WebElement boton;

	public void registro(String user, String pass, String addr, String Badd, String state, String gen, String select) {

		Select dropdown = new Select(State);

		User.sendKeys(user);
		Pass.sendKeys(pass);
		Pass2.sendKeys(pass);
		gender(gen);
		Addr.sendKeys(addr);
		BAddr.sendKeys(Badd);
		dropdown.selectByVisibleText(state);
		terms.click();
		button(select);

	}

	public String checkAlert(WebDriver driver) {
		String texto = "";
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			texto = alert.getText();
			alert.accept();
		} catch (Exception e) {
			// exception handling
		}
		return texto;
	}

	public void gender(String gen) {

		//List<WebElement> radios = Gender.findElements(By.xpath("//input[@type ='radio']"));
		
		try {
			
			for (WebElement Gender : Gender) {

				if (Gender.getAttribute("value").contains(gen)) {
					Gender.click();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}

	public void button(String selec) {

		try {
			List<WebElement> btn = boton.findElements(By.xpath("//input[@type='button']"));

			for (WebElement boton : btn) {

				if (boton.getAttribute("value").contains(selec)) {
					boton.click();
				}
			}

		} catch (Exception e) {

		}
	}

}
