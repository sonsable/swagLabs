package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {
	
	
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement filterbtn;
	@FindBy(xpath = "//option[@value='za']") private WebElement filterZtoA;
	@FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-fleece-jacket']") private WebElement addJacket;
	@FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement addShirt;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement  cart;
	@FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button']") private WebElement checkoutBtn;
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement userFname;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement userLname;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']") private WebElement zipcode;
	@FindBy(xpath = "//input[@data-test='continue']") private WebElement continueBtn;
	@FindBy(xpath = "//button[@data-test='finish']") private WebElement finishBtn;
	@FindBy(xpath = "//button[@data-test='cancel']") private WebElement cancelBtn;
	@FindBy(xpath = "//button[@data-test='remove-sauce-labs-fleece-jacket']") private WebElement removeJacket;
	@FindBy(xpath = "//button[@data-test='remove-sauce-labs-bolt-t-shirt']") private WebElement removeShirt;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']") private WebElement logoutBtn;
	
	
	public DashboardPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void addItemToCart()
	{
		filterbtn.click();
		filterZtoA.click();
		addJacket.click();
		addShirt.click();
	}
	
	
	public void checkout()
	{
		cart.click();
		checkoutBtn.click();
		userFname.sendKeys("Raina");
		userLname.sendKeys("sera");
		zipcode.sendKeys("55465");
		continueBtn.click();
		
	}
	
	public void done()
	{
		finishBtn.click();
	}
	
	
	public void cancel()
	{
		cancelBtn.click();
		removeJacket.click();
		removeShirt.click();
		
	}
	
	
	public void logout()
	{
		
		menuBtn.click();
		logoutBtn.click();
		
	}
	
}
