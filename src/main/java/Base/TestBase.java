package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static WebDriver driver;//--WE MADE THE DRIVER STATIC BCZ WE WANT ONLY ONE COPY OF DRIVER THROUGHOUT THE PROJECT
	
	public void initialization() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		driver	=	new	ChromeDriver(chrome);
		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(25,	TimeUnit.SECONDS);
		
		driver.get(readPropertyFile("url")); //this is used to get url from config file
	}
	
	
	//--------BELOW CODE IS TO GET INFO FROM CONFIG.PROPERTIES FILE, SO THAT OUR CODE WILL NOT BE HARDCODE, AND EASIER
	//TO CHANGE DATA WHENEVER REQUIRE
	
	
	//below method needs to return something in order to execute the actions, so its returning the url and its string
	//so passed string argument inside method
	
	
	public String readPropertyFile(String value) throws IOException
	{
		Properties prop=new Properties(); //CREATED OBJ OF PROPERTIES CLASS
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\SwagLabsProject\\src\\main\\java\\Configure\\config.properties");
		
		//--IN FILEINPUTSTREAM WE HAVE PASSED THE ADDRESS OF CONFIG.PROPERTY FILE
		
		prop.load(file); //to load the file into property object from fileinputstream object
		
		return prop.getProperty(value);
	}

	
	
	
}
