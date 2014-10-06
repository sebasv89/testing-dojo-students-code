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
	
	private static WebDriver _driver;
	
	
	@BeforeClass
	public static void addRoomBeforeClass() {
		_driver = new FirefoxDriver();

	}
	
	@AfterClass
	public static void testaddRoomAfter() {
		//_driver.quit();
	}
	
	@Test
	public void tetsAddRoom(){
		
		Random random = new Random();
		String numberroom = "1" + Math.abs(random.nextInt(1000));	
		
		_driver.get("http://evening-woodland-2196.herokuapp.com/DCARDONAM/addRoom");
	
		
		WebElement name= _driver.findElement(By.name("name"));
		name.sendKeys(numberroom);
		
		WebElement radio = _driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div[3]/div[1]/div[3]/label"));
		radio.click();
		
		WebElement checkbox = _driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div[3]/div[2]/div[2]/div/label"));
		checkbox.click();
		
		WebElement saveButton = _driver.findElement(By.className("btn"));
		saveButton.click();
		
		String savedMessage = _driver.findElement(By.className("panel-title")).getText();
		String detailMessage = _driver.findElement(By.className("panel-body")).getText();
		
		
		List<WebElement> list = _driver.findElements(By.tagName("td"));
		
		String roomResult = list.get(3).getText();
		Assert.assertEquals("Guardado:", savedMessage);
		Assert.assertEquals("Datos guardados correctamente.", detailMessage);
		Assert.assertEquals("Habitaci? de lujo", roomResult);
		
		
	}
	

}
