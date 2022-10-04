package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase 
{
	HomePage home;
	UserRegistrationPage register;
	LogInPage log;
	
	String firstname = "mahmoud";
	String lastname = "gamal";
	String email = "ssaamm@mm.com";
	String password = "123123123";
	String confirmpass = "123123123";
	@Test (priority = 1 , alwaysRun = true)
	public void userreister ()
	{
		home = new HomePage(driver);
		home.clickonregiserbtn();
		register = new UserRegistrationPage(driver);
		register.UserRegistration(firstname, lastname, email, password, confirmpass);
	}
	@Test (dependsOnMethods = {"userreister"})
	public void clickonlogoutbutton ()
	{
		register.clickonlogoutbtn();
	}
	@Test(dependsOnMethods = {"clickonlogoutbutton"})
	public void loginprocess ()
	{
		home = new HomePage(driver);
		home.clickonloginbtn();
		log = new LogInPage(driver);
		log.loginwithregistereduser(email, password);
		//Assert.assertTrue(register.logoutbtn.getText().contains("log out"));
	}

}
