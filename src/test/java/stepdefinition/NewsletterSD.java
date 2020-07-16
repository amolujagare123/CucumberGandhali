package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSD {

    @Given("I am on newsletter page")
    public void i_am_on_newsletter_page() {
        System.out.println("I am on newsletter page");
    }

    @When("^i enter subscriber with (.+) , (.+) , (.+)$")
    public void i_enter_subscriber_with_(String name, String email, String phone) throws Throwable {
        System.out.println("subscriber details added as:");
        System.out.println(name+" "+email+" "+phone);
    }



    @Then("the subscriber is subscribed to the newsletter")
    public void the_subscriber_is_subscribed_to_the_newsletter() {
        System.out.println("the subscriber is subscribed to the newsletter");
    }
}
