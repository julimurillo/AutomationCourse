package AutomationCourse.MavenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicio de automatización" );
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://developsupport.com/qIntranet/login/index.php");
        
        //----------------------------------------------------------------
        
        
        WebElement txtName;
        WebElement passwd;
        WebElement btnEntrar;
        
        txtName=driver.findElement(By.id("username"));
        txtName.sendKeys("jmurillo");
        passwd=driver.findElement(By.id("password"));
        passwd.sendKeys("P13919045*a");
        btnEntrar=driver.findElement(By.id("loginbtn"));
        btnEntrar.click();
        
        WebElement validacion;
        validacion=driver.findElement(By.xpath("//*[@id=\"region-main\"]/div[2]/div/div/div/div[1]/span"));
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (validacion.isDisplayed()) {
         System.out.println("Inicio de sesion Fallida");	
        	
        }
            
               
    }
}
