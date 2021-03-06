package Homework.LoginHomeWork;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		File Data = new File("data.txt");
		FileReader fr;
		EscribirArchivo EA = new EscribirArchivo();
		System.out.println("Login Test");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		EA.escribirArchivo();

		try {
			fr = new FileReader(Data);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			while ((linea = br.readLine()) != null) {

				String[] datos = linea.split(",");

				driver.get("https://www.netflix.com/co/");
				WebElement btnInicio = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[2]"));
				btnInicio.click();
				WebElement txtUser = driver.findElement(By.id("id_userLoginId"));
				txtUser.sendKeys(datos[0]);
				WebElement txtPasswd = driver.findElement(By.id("id_password"));
				txtPasswd.sendKeys(datos[1]);
				WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button"));
				btnLogin.click();
				br.close();

			}
		} catch (Exception e) {
		}

		WebElement message = driver
				.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div[2]/div/div/div"));
		

		if (message.isDisplayed()) {
			System.out.println("Login success");
		} else{
			System.out.println("Login failed");
		}

	}

}
