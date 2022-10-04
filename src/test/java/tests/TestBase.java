package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.Helper;

public class TestBase extends AbstractTestNGCucumberTests
{
	public static WebDriver driver;
	@BeforeSuite
	@Parameters ({"browser"})
	public void startDriver (@Optional ("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	@AfterSuite
	public void closeDriver()
	{
		driver.quit();
	}
	@AfterMethod
	public void takescreenshot (ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("error");
			System.out.println("taking screenshot");
			Helper.capturescreenshot(driver, result.getTestName());
			
		}
	}

}
