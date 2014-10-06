package co.com.psl.testingdojo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageTest {
	
	@Test
	public void openPage(){
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://evening-woodland-2196.herokuapp.com/ajaramillog/addDoctor");
	}
	
	
	
	
}
