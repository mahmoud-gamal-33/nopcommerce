package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase
{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (id = "FullName")
	WebElement mynametxt;
	@FindBy (id = "Email")
	WebElement mymail;
	@FindBy (id = "Enquiry")
	WebElement myEnquiry;
	@FindBy (css = "button.button-1.contact-us-button")
	WebElement submitbtn;
	@FindBy (css = "div.result")
	public WebElement success;
	
	public void contact (String name, String mail , String enquiry)
	{
		sendText(mynametxt, name);
		sendText(mymail, mail);
		sendText(myEnquiry, enquiry);
		clickButton(submitbtn);
	}
	

}
