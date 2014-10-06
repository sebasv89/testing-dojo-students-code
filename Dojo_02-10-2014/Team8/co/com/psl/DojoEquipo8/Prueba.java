package co.com.psl.DojoEquipo8;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prueba {
/*	@Test
	public void testFillaAll(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addDoctor");
		WebElement nombre = driver.findElement(By.id("name"));
		WebElement apellido = driver.findElement(By.id("last_name"));
		WebElement telefono = driver.findElement(By.id("telephone"));
		WebElement tidentificacion = driver.findElement(By.id("identification_type"));
		Select dropDown = new Select(tidentificacion);
		String selected = dropDown.getFirstSelectedOption().getText();
		WebElement identificacion = driver.findElement(By.id("identification"));
		
		WebElement botonGuardar = driver.findElement(By.className("btn"));
		
		nombre.sendKeys("");
		apellido.sendKeys("Broz");
		telefono.sendKeys("3013423456");
		//dropDown.selectByValue(value);
		identificacion.sendKeys("1098095");
		
		botonGuardar.click();
		
		String resultName = driver.findElement(By.id("firstName")).getText();
		Assert.assertEquals("Vanesa", resultName);
		
		String resultApellido = driver.findElement(By.id("lastName")).getText();
		Assert.assertEquals("Broz", resultApellido);
		
		String resultTelefono = driver.findElement(By.id("telephone")).getText();
		Assert.assertEquals("3013423456", resultTelefono);
		
		//String resultCedulaTipo = driver.findElement(By.id("identification_type")).getText();
		Assert.assertEquals("Cédula de ciudadanía", selected);
		
		String resultCedula = driver.findElement(By.id("identification")).getText();
		Assert.assertEquals("1098095", resultCedula);
		
		
		
		
		
		}
	
	@Test
	public void testNoName(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addDoctor");
		WebElement nombre = driver.findElement(By.id("name"));
		WebElement apellido = driver.findElement(By.id("last_name"));
		WebElement telefono = driver.findElement(By.id("telephone"));
		WebElement tidentificacion = driver.findElement(By.id("identification_type"));
		Select dropDown = new Select(tidentificacion);
		String selected = dropDown.getFirstSelectedOption().getText();
		WebElement identificacion = driver.findElement(By.id("identification"));
		
		WebElement botonGuardar = driver.findElement(By.className("btn"));
		
		nombre.sendKeys("");
		apellido.sendKeys("Broz");
		telefono.sendKeys("3013423456");
		//dropDown.selectByValue(value);
		identificacion.sendKeys("1098095");
		
		botonGuardar.click();
		
		String result = driver.findElement(By.className("panel-body")).getText();
		Assert.assertEquals("No se pudo guardar debido a:\n*El campo 'Nombre' es requerido.", result);
	
		}
	
	@Test
	public void testNolastname(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addDoctor");
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
	
		}*/
	/* @Test
	public void testNolastname(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addDoctor");
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
	
		} */
	
	@Test
	public void CamposRequeridos(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://evening-woodland-2196.herokuapp.com/jvallejo/addDoctor");
		
		WebElement botonGuardar = driver.findElement(By.className("btn"));
		botonGuardar.click();
		
		List<WebElement> result = driver.findElements(By.className("text-danger"));
				Assert.assertEquals("*El campo 'Nombre' es requerido", result.get(0).getText());
				Assert.assertEquals("*El campo 'Apellidos' es requerido", result.get(1).getText());
				Assert.assertEquals("*El campo 'Documento de identidad' es requerido", result.get(2).getText());
	}
	
}
