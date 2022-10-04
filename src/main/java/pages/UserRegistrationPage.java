package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase 
{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "FirstName")
	WebElement FirstNametxt;
	
	@FindBy(id = "LastName")
	WebElement LastNametxt;
	
	@FindBy (id = "Email")
	WebElement Emailtxt;
	
	@FindBy (id = "Password")
	WebElement Passwordtxt;
	
	@FindBy (id = "ConfirmPassword")
	WebElement ConfirmPasswordtxt;
	
	@FindBy (id = "register-button")
	WebElement Registerbtn;
	
	@FindBy (css = "a.ico-logout")
	public WebElement logoutbtn;
	
	@FindBy (css = "a.ico-account")
	WebElement myaccountbtn;
	@FindBy (css = "div.result")
	public WebElement successmsg;
	
	public void UserRegistration (String FN,String LN, String mail, String pass, String confirmpass)
	{
		sendText(FirstNametxt, FN);
		sendText(LastNametxt, LN);
		sendText(Emailtxt, mail);
		sendText(Passwordtxt, pass);
		sendText(ConfirmPasswordtxt, confirmpass);
		clickButton(Registerbtn);
	}
	public void clickonlogoutbtn()
	{
		clickButton(logoutbtn);
	}
	public void openmyaccountpage()
	{
		clickButton(myaccountbtn);
	}

}
