package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HoverTest extends TestBase
{
	HomePage home;
	@Test
	public void hoveroncomputerslist() throws InterruptedException
	{
		home = new HomePage(driver);
		home.hoveroncomputers();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().contains("notebook"));
	}

}
