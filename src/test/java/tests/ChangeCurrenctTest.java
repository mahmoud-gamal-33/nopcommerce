package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SearchDetailsPage;
import pages.SearchPage;

public class ChangeCurrenctTest extends TestBase
{
	HomePage home;
	SearchPage ss;
	SearchDetailsPage details;
	String myproduct = "mac";
	
	
	@Test(priority = 1)
	public void userchangecurrency()
	{
		home = new HomePage(driver);
		home.changecuur();
	}

	@Test (priority = 2)
	public void searchforproduct()
	{
		ss = new SearchPage(driver);
		ss.searching(myproduct);
		details = new SearchDetailsPage(driver);
		Assert.assertTrue(details.selectedpro.getText().contains("Apple MacBook Pro 13-inch"));
		Assert.assertTrue(details.success.getText().contains("€"));
	}

}
