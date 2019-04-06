package com.qvision.capacitacion.pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.annotations.findby.By;

public class ResultsPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"salary3\"]")
	WebElement Salary;

	@FindBy(xpath = "//*[@id=\"publishDate1\"]")
	WebElement publishDate;

	@FindBy(xpath = "/html/body/div[8]/div[3]/div[1]/h2/span[1]/strong[2]")
	WebElement txtNumeroDeResultados;

	@FindBy(xpath = "/html/body/div[8]/div[2]/h1")
	WebElement lblValidate;

	WebElement txtTituloDeOferta;
	WebElement txtEmpresa;
	WebElement txtFecha;



	FileWriter fichero = null;
	PrintWriter pw = null;

	public boolean validate() {
		boolean isSearch = false;
		String valid = lblValidate.getText();
		try {
			if (valid.equals("Empleos Contador en Bogotá")) {
				isSearch = true;

			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		return isSearch;
	}

	public void filters() {
		
		waitFor(Salary).isClickable();
		Salary.click();
		try {
		
			Thread.sleep(10);
			publishDate.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void readOfferts() throws IOException {
		try {
			fichero = new FileWriter("Files\\Jobs.txt");
			pw = new PrintWriter(fichero);
			int numEntero = Integer.parseInt(txtNumeroDeResultados.getText());
			for (int i = 1; i <= numEntero; i++) {
				txtTituloDeOferta = find(
						By.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[" + i + "]/div[1]/ul/li[1]/h2/a"));
				String txtOferta = txtTituloDeOferta.getText();
				txtEmpresa = find(By.xpath(
						"/html/body/div[8]/div[4]/div[1]/div[3]/div[" + i + "]/div[1]/ul/li[2]/h3/span[2]/span"));
				String txtEmpresas = txtEmpresa.getText();
				txtFecha = find(
						By.xpath("/html/body/div[8]/div[4]/div[1]/div[3]/div[" + i + "]/div[1]/ul/li[3]/span[3]"));
				String txtFechas = txtFecha.getText();
				pw.println(txtOferta + "\n" + txtEmpresas + txtFechas + "\n" + "**********************************");
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void screenshot() {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) getDriver());
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("Evidencia\\" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			System.out.println("ERROR EN SS!" + e);
		}
	}

}
