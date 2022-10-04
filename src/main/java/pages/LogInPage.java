package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends PageBase {

	public LogInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "Email")
	WebElement usernametext;
	
	@FindBy (id = "Password")
	WebElement passtext;
	
	@FindBy (css = "button.button-1.login-button")
	WebElement loginbutton;
	
	public void loginwithregistereduser( String name , String pass)
	{
		sendText(usernametext, name);
		sendText(passtext, pass);
		clickButton(loginbutton);
	
	}

}
 