package co.com.psl.testingdojo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddPaciente {

private WebDriver webDriver = new FirefoxDriver();
	
	public void openPage(){
		webDriver.get("http://evening-woodland-2196.herokuapp.com/ajaramillog/addPatient");
	}
	
	
	@Test
	public void FillFields(){
		//webDriver.get("http://evening-woodland-2196.herokuapp.com/ajaramillog/addDoctor");
		webDriver.findElement(By.name("name")).sendKeys("Test1");
		webDriver.findElement(By.name("last_name")).sendKeys("asd1");
		webDriver.findElement(By.name("telephone")).sendKeys("567561");		
		webDriver.findElement(By.name("identification")).sendKeys("1231231");
		webDriver.findElement(By.name("prepaid")).isSelected();
		webDriver.findElement(By.className("btn")).click();
		
		String mensaje= webDriver.findElement(By.className("panel-title")).getText();
		Assert.assertEquals("Guardado:", mensaje);
		webDriver.quit();
		
	}
	
}
