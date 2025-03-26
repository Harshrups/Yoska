package Pages;

import org.openqa.selenium.*;

public class Register {


	 WebDriver driver;
	
	String xpath_email_textfield="//input[@name='email']";
	String xpath_firstname_textfield="//input[@name='firstName']";
	String xpath_lastname_textfield="//input[@name='lastName']";
	String xpath_password_textfield="//input[@name='password']";
	String xpath_register_btn="//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth mb0 css-83kvie']";
	String xpath_ok_popup="//button[@class='swal2-confirm swal2-styled']";
	
	
	public Register(WebDriver rdriver)
	{
		driver = rdriver;

	}
	
	public void setEmail(String email)
	{
		driver.findElement(By.xpath(xpath_email_textfield)).clear();
		driver.findElement(By.xpath(xpath_email_textfield)).sendKeys(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFirstName(String fname)
	{
		driver.findElement(By.xpath(xpath_firstname_textfield)).clear();
		driver.findElement(By.xpath(xpath_firstname_textfield)).sendKeys(fname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setLastName(String lname)
	{
		driver.findElement(By.xpath(xpath_lastname_textfield)).clear();
		driver.findElement(By.xpath(xpath_lastname_textfield)).sendKeys(lname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(By.xpath(xpath_password_textfield)).clear();
		driver.findElement(By.xpath(xpath_password_textfield)).sendKeys(pass);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Clickregisterbtn()
	{
		driver.findElement(By.xpath(xpath_register_btn)).click();
	}
	
	public void Clickokpopu() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath_ok_popup)).click();
	}
}

