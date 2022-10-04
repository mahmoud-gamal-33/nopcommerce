package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegistrationPage;
import tests.TestBase;

public class UserRegistration extends TestBase
{
	@Given("user in homepage")
	public void user_in_homepage() {
		HomePage homeobject = new HomePage(driver);
		homeobject.clickonregiserbtn();

	}
	@When("user click on register button")
	public void user_click_on_register_button() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));

	}

	/*
	 * @When("input all mandatory data") public void input_all_mandatory_data() {
	 * UserRegistrationPage userobject = new UserRegistrationPage(driver);
	 * userobject.UserRegistration("mahmoud", "marwan", "mm@aa.com", "123147147",
	 * "123147147"); }
	 */
	@When("input {string} ,{string},{string} , {string}")
	public void input(String firstname, String lastname, String email,String password) 
	{
		 UserRegistrationPage userobject = new UserRegistrationPage(driver);
		  userobject.UserRegistration(firstname, lastname, email, password, password);
	}
	@Then("user is registered now")
	public void user_is_registered_now() {
		UserRegistrationPage userobject = new UserRegistrationPage(driver);
		userobject.clickonlogoutbtn();

	}

}
