package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LogInPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestwithexcel extends TestBase 
{
	HomePage home;
	UserRegistrationPage register;
	LogInPage log;

	@DataProvider(name="TestData")
	public Object [][] getdatafromexcel() throws IOException
	{
		ExcelReader er = new ExcelReader();
		return er.getexceldata();
	}
	@Test (priority=1,alwaysRun = true ,dataProvider="TestData")
	public void userreister (String fn, String ln, String email, String pass)
	{
		home = new HomePage(driver);
		home.clickonregiserbtn();
		register = new UserRegistrationPage(driver);
		register.UserRegistration(fn, ln, email, pass, pass);	
		register.clickonlogoutbtn();
		home.clickonloginbtn();
		log = new LogInPage(driver);
		log.loginwithregistereduser(email, pass);
		register.clickonlogoutbtn();
	}

}
