package Test_Cases;

import org.openqa.selenium.*;

import org.testng.Assert;

import org.testng.annotations.Test;
import Pages.Register;
import Config.Setup;
import Test_Data.BaseClass;

public class Verify_Register extends Setup{
	Register register;
	@Test
	public void test_verify_register_functionality_001() throws InterruptedException 
	{
		String ext_result = "User created successfully";
		
		super.driver.get(BaseClass.baseUrl);
		register = new Register(super.driver);
		register.setEmail(BaseClass.email);
		register.setFirstName(BaseClass.fname);
		register.setLastName(BaseClass.lname);
		register.setPassword(BaseClass.password);
		register.Clickregisterbtn();
		
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
		
	}
}
