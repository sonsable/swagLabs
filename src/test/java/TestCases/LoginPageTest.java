package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	LoginPage obj; //---we need to make the obj global so that its accessible inside other method
	

	@BeforeMethod
	
	public void setup() throws IOException
	{
		initialization(); //-CALLING HERE TESTBASE CLASS METHOD, BCZ IT HAS BROWSER OPENING CODE
	
		 obj=new LoginPage(); //-----created object of loginpage class
		
	}
	
	
	//---below method we r just verifying the title and also checking if its correct title or not
	
	@Test
	public void verifyTitleTest()
	{
		
		String value = obj.verifyTitle(); //---calling method from loginpage class, but these two classes are not connected so we need to
						         //create object of that class, here we created it inside setup method above
	
	Assert.assertEquals("Swag Labs", value);
	
	
	}
	
	
	
	@Test
	public void verifySwagLogoTest()
	{
		
		obj.verifySwagLogo();
		
	}
	
	@Test
	public void logintoAppTest() throws InterruptedException
	{
		obj.logintoapp();
	}
	
	
    @AfterMethod
	
	public void exit()
	{
		driver.quit();
	}

}
