package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Netbanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
        //Navigate to Login URL
    	System.out.println("Navigated to login page");
    }

    @When("^User logged in with valid username and password$")
    public void user_logged_in_with_valid_username_and_password() throws Throwable {
        //Code to login
    	System.out.println("Logged in sucessully");
    }

    @Then("^Home page for User was populated$")
    public void home_page_for_user_was_populated() throws Throwable {
        //Home page validation
    	System.out.println("Home page was Validated");
    }

    @And("^Bank Account information was displayed$")
    public void bank_account_information_was_displayed() throws Throwable {
        //Displaying account information
    	System.out.println("User's Account information was displayed");
    }

}