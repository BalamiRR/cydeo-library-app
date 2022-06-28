package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchResults {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    }

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
    }

    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(io.cucumber.datatable.DataTable dataTable) {
    }
}
