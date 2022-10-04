package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
		
	}
	
	@FindBy (className = "ico-register")
	WebElement Registerbtn;
	
	@FindBy(css = "a.ico-login")
	WebElement loginbtn;
	@ FindBy (linkText = "Contact us")
	WebElement contactusbtn;
	@FindBy (id = "customerCurrency")
	WebElement currencydropdownlist;
	@FindBy (xpath = "//a[@href='/computers']")
	WebElement computersbtn;
	@FindBy (xpath = "//a[@href='/notebooks']")
	WebElement notebookbtn;
	 
	public void clickonregiserbtn ()
	{
		clickButton(Registerbtn);
	}
	
	public void clickonloginbtn ()
	{
		clickButton(loginbtn);
	}
	 public void clickoncontactus()
	 {
		 scrolldown();		 
		 clickButton(contactusbtn);
	 }
	 public void changecuur()
	 {
		 select = new Select(currencydropdownlist);
		 select.selectByIndex(1);
	 }
	 public void hoveroncomputers()
	 {
		 action
		 .moveToElement(computersbtn)
		 .moveToElement(notebookbtn)
		 .click().perform();
	 }
}
