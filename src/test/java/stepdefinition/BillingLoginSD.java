package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingLoginSD {

    @Given("I am on billing login page")
    public void i_am_on_billing_login_page() {
        System.out.println("I am on billing login page");
    }

    @When("I enter correct username and password on billing login page")
    public void i_enter_correct_username_and_password_on_billing_login_page() {
        System.out.println("I enter correct username and password on billing login page");
    }

    @When("I click on login button on billing login page")
    public void i_click_on_login_button_on_billing_login_page() {
        System.out.println("I click on login button on billing login page");
    }

    @Then("I should land up to billing home page")
    public void i_should_land_up_to_billing_home_page() {
        System.out.println("I should land up to billing home page");
    }


    @When("I enter correct {string} and {string} on billing login page")
    public void i_enter_correct_and_on_billing_login_page(String username, String password) {

        System.out.println("I Enter :"+username+" "+password);
    }

}
