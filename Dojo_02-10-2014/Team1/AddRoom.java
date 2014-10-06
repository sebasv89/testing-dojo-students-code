package co.com.psl;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddRoom {
	

	private static WebDriver driver;

	@BeforeClass
	public static void init() {
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	public static void destroy(){
		driver.quit();	
	}

	@Test
	
	public void testAddRoom(){
		driver.get("http://evening-woodland-2196.herokuapp.com/aramireznname/addRoom");
		
		WebElement txtRoom =driver.findElement(By.name("name"));
		String roomNumber = "234" + String.valueOf(System.currentTimeMillis());
		txtRoom.sendKeys(roomNumber);
		
		List<WebElement> selIDType = driver.findElements(By.name("optionsRadios"));
		selIDType.get(1).click();
		
		List<WebElement> selCharRoom = driver.findElements(By.xpath("//input[@type='checkbox']"));
		selCharRoom.get(1).click();
		
		WebElement saveButton =driver.findElement(By.className("btn"));
		saveButton.click();
		
		WebElement successText = driver.findElement(By.className("panel-title"));
		String text = successText.getText();
		
		WebElement detailText = driver.findElement(By.className("panel-body"));
		String textMessage = detailText.getText();
		
		Assert.assertEquals("Guardado:", text);
		Assert.assertEquals("Datos guardados correctamente.", textMessage);
		List<WebElement> cols = driver.findElements(By.tagName("td"));
		
		String roomNum;
		roomNum = cols.get(1).getText();
		String roomName = cols.get(3).getText();
		Assert.assertEquals(roomNumber, roomNum);
		Assert.assertEquals(roomName, "Habitaci? de lujo");
		
		
		
		//setup
		
		
		
	}
	
	

}
