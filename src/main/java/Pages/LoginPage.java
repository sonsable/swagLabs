package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
//----------OBJECT REPOSITORY	------------------//
	
	
	@FindBy(xpath="//div[@class='login_logo']") private WebElement swagLogo;
	@FindBy(xpath = "//input[@placeholder='Username']") private WebElement userid;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement password;
	@FindBy(xpath = "//input[@class='submit-button btn_action']") private WebElement loginbtn;
	
	
	
	public LoginPage() //-CONSTRUCTOR FOR INITIALIZATION DATA MEMEBERS
	{
		
	PageFactory.initElements(driver, this); //--this is to initialize data members (constructor is required for this)
	}
	
	

	public void verifySwagLogo() //-----VERIFYING LOGO
	
	{
		swagLogo.isDisplayed();
	}

	
	public String verifyTitle()  //-------VERIFYING TITLE 
	{
		
		return driver.getTitle();
	}
	
	
	public void logintoapp() throws InterruptedException
	{
		userid.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginbtn.click();
	}
	
}
