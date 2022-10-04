package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (id = "small-searchterms")
	WebElement searchtxt;
	@FindBy (css = "button.button-1.search-box-button")
	WebElement searchbutton;
	@FindBy(id = "ui-id-8")
	WebElement searchlist;
	
	public void searching(String productname)
	{
		sendText(searchtxt, productname);
		clickButton(searchbutton);
	}

}
