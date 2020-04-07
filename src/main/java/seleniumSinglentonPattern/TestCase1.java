package seleniumSinglentonPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		DriverInit obj =	DriverInit.getInstance();
		driver = obj.openBrowser();
	}
	
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.co.in/");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
