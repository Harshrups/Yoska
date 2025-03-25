package Config;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup 
{

	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}