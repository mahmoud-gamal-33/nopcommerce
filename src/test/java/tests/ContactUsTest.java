package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase
{
	HomePage home;
	ContactUsPage cont;
	String nm = "mahmoud";
	String ml = "mm@mm.com";
	String query = "hello";
	@Test
	public void contactus()
	{
		home = new HomePage(driver);
		home.clickoncontactus();
		cont=new ContactUsPage(driver);
		cont.contact(nm, ml, query);
		Assert.assertTrue(cont.success.getText().contains("Your enquiry has been successfully sent to the store owner"));
		
	}

}
