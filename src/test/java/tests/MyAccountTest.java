package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase
{
	HomePage home;
	UserRegistrationPage register;
	UserRegistrationPage user;
	MyAccountPage acc;
	LogInPage log;
	
	
	String firstname = "mahmoud";
	String lastname = "gamal";
	String email = "sammm@mm.com";
	String password = "123123123";
	String confirmpass = "123123123";
	String newpass = "123123654";
	
	
	@Test (priority = 1 , alwaysRun = true)
	public void userreister ()
	{
		home = new HomePage(driver);
		home.clickonregiserbtn();
		register = new UserRegistrationPage(driver);
		register.UserRegistration(firstname, lastname, email, password, confirmpass);
		Assert.assertTrue(register.successmsg.getText().contains("Your registration completed"));
	}
	@Test (priority = 2)
	public void changepasswordforregistereduser()
	{
		register.openmyaccountpage();
		acc = new MyAccountPage(driver);
		acc.changemypassword(password, newpass);
		Assert.assertTrue(acc.alert.getText().contains("Password was changed"));
	}

}
