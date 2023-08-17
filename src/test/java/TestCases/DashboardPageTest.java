package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase{
	
	DashboardPage dash;
	LoginPage obj;
	

	@BeforeMethod
	
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		 dash=new DashboardPage();
		 obj=new LoginPage();
		 obj.logintoapp();        //HERE WE CALLED THIS METHOD BCZ WE FIRST NEED TO LOGIN TO APP AND WE CAN PERFORM BELOW
								  //METHODS ACTIONS ON IT.
		
		 dash.addItemToCart(); //added these 2 methods here bcz these are common in both below methods, so instead of
		 dash.checkout();	   //writing it in each method, written here once
	}
	
	
	@Test (priority = 1)
	public void shoppingTest()
	{
		
	  dash.done();
	  dash.logout();
	  
	}
	
	
	@Test (priority = 2)
	public void cancelTest()
	{
		
	   dash.cancel();
	   dash.logout();
		
	}
	
	
	
	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}
}
