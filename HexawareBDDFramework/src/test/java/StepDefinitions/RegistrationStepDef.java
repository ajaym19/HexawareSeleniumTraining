package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {

	@Given("user is already logged in and is on User Registration Page")
	public void user_is_already_logged_in_and_is_on_user_registration_page() {
	    System.out.println(1);
	}
	@When("user enters the firstname as {string}")
	public void user_enters_the_firstname_as(String string) {
		System.out.println(2);
	}
	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
		System.out.println(3);
	}
	@When("user enters the email as {string}")
	public void user_enters_the_email_as(String string) {
		System.out.println(4);
	}
	@When("user selects gender as {string}")
	public void user_selects_gender_as(String string) {
		System.out.println(5);
	}
	@When("user selects dept as {string}")
	public void user_selects_dept_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(6);
	}
	@When("user clicks on Add button")
	public void user_clicks_on_add_button() {
		System.out.println(7);
	}
	@Then("a new user should be registered")
	public void a_new_user_should_be_registered() {
		System.out.println(8);
	}
}
