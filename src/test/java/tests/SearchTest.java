package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchDetailsPage;
import pages.SearchPage;

public class SearchTest extends TestBase
{
	SearchPage ss;
	SearchDetailsPage details;
	String myproduct = "mac";
	@Test
	public void searchforproduct()
	{
		ss = new SearchPage(driver);
		ss.searching(myproduct);
		details = new SearchDetailsPage(driver);
		Assert.assertTrue(details.selectedpro.getText().contains("Apple MacBook Pro 13-inch"));
	}

}
