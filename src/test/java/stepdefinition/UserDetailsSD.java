package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserDetailsSD {

    @Given("I am on user details page")
    public void i_am_on_user_details_page() {
        System.out.println("I am on user details page");
    }

    @When("I enter below details")
    public void i_enter_below_details(DataTable dataTable) {
       List<List<String>> data = dataTable.asLists();

        System.out.println(data.get(0).get(0));
        System.out.println(data.get(0).get(1));
        System.out.println(data.get(0).get(2));
        System.out.println(data.get(0).get(3));

    }

    @Then("data is entered successfully")
    public void data_is_entered_successfully() {
        System.out.println("data is entered successfully");
    }




}
