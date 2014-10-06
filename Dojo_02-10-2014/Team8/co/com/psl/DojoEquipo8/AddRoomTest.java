package co.com.psl.DojoEquipo8;

import java.util.List;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddRoomTest {
	
	private static final String ROOM_NAME = "name";
	private static final String INPUT_VALUE_LUXURY_ROOM = "//input[@value= 'Habitación de lujo']";
	private static WebDriver webDriver;
	private static WebElement roomName; 
	private static WebElement roomType;
	private static WebElement roomLuxury;
	private static WebElement roomSave;
	private static WebElement roomMessage;
	
	
	@BeforeClass
	public static void init(){
			webDriver = new FirefoxDriver();
			webDriver.get("http://evening-woodland-2196.herokuapp.com/msandoval/addRoom");
			
			roomName= webDriver.findElement(By.name(ROOM_NAME)); 
			roomType= webDriver.findElement(By.xpath(INPUT_VALUE_LUXURY_ROOM)); 
			roomLuxury= webDriver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div[3]/div[2]/div[2]/div/label/input"));
			roomSave= webDriver.findElement(By.className("btn"));
			
	}
	
	
	@Test
	public void testHappyPath()	{
		
		Random random = new Random();
		
		int rnd = Math.abs(random.nextInt());
		String value = String.valueOf(rnd);
		roomName.sendKeys(value);
		roomType.click();
		roomLuxury.click();
		roomSave.click();
		
		//verify
		roomMessage= webDriver.findElement(By.className("panel-body"));
		Assert.assertEquals("Datos guardados correctamente.", roomMessage.getText());
		
		List <WebElement> dataGrid = webDriver.findElements(By.tagName("td"));
		String roomNum = dataGrid.get(1).getText();
		Assert.assertEquals(value, roomNum);
		
		
		String roomType1 = dataGrid.get(2).getText();
		Assert.assertEquals("Tipo de habitación", roomType1);
		
		String saveRoomType1 = dataGrid.get(3).getText();
		Assert.assertEquals("Habitaci? de lujo", saveRoomType1);
		
		String doubleRoomText = dataGrid.get(4).getText();
		Assert.assertEquals("Habitación doble", doubleRoomText);
		
		String doubleRoomTextValue = dataGrid.get(5).getAttribute("class");
		Assert.assertEquals("fa fa-fw fa-times", doubleRoomTextValue);
		
		
		
	}
	
	
	
	@AfterClass
	public static void destroy(){
			//webDriver.quit();
	}

}
