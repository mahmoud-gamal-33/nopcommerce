package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase
{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	UserRegistrationPage register;
	
	@FindBy (linkText ="Change password")
	WebElement changepassbtn;
	@FindBy(id = "OldPassword")
	WebElement oldpasstxt;
	@FindBy (id = "NewPassword")
	WebElement newpasstxt;
	@FindBy (id = "ConfirmNewPassword")
	WebElement confirmpasstxt;
	@FindBy (css = "button.button-1.change-password-button")
	WebElement changepassbutton;
	@FindBy (css = "p.Password was changed")
	public WebElement alert;
	
	public void changemypassword(String old , String neew)
	{
		sendText(oldpasstxt, old);
		sendText(newpasstxt, neew);
		sendText(confirmpasstxt, neew);
		clickButton(changepassbutton);

	}

}
