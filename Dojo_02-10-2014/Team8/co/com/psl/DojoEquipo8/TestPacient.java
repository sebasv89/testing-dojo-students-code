package co.com.psl.DojoEquipo8;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestPacient {
	@Test
	public void testNolastname(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addPatient");
		WebElement nombre = driver.findElement(By.id("name"));
		WebElement apellido = driver.findElement(By.id("last_name"));
		WebElement telefono = driver.findElement(By.id("telephone"));
		WebElement tidentificacion = driver.findElement(By.id("identification_type"));
		Select dropDown = new Select(tidentificacion);
		String selected = dropDown.getFirstSelectedOption().getText();
		WebElement identificacion = driver.findElement(By.id("identification"));
		
		WebElement botonGuardar = driver.findElement(By.className("btn"));
		
		nombre.sendKeys("Nombre");
		//apellido.sendKeys("Broz");
		telefono.sendKeys("3013423456");
		//dropDown.selectByValue(value);
		identificacion.sendKeys("1098095");
		
		botonGuardar.click();
		
		String result = driver.findElement(By.className("panel-body")).getText();
		Assert.assertEquals("No se pudo guardar debido a:\n*El campo 'Apellidos' es requerido.", result);
	
		}
}
