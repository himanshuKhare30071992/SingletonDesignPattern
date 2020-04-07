package seleniumSinglentonPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit 
{
	private static DriverInit instanceDriver;
	private WebDriver driver;
	
	private DriverInit()
	{
		
	}
	
	public static DriverInit getInstance()
	{
		if(instanceDriver == null)
		{
			instanceDriver = new DriverInit();
		}
		return instanceDriver;
	}
	

	public WebDriver openBrowser()
	{
		driver = new ChromeDriver();
		return driver;
	}
	
	
}
