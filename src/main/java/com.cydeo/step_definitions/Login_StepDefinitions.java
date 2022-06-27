package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
    }

    /**
     * Student Part below
     * */

    @When("user enters student username")
    public void user_enters_student_username() {
    }

    @And("user enters student password")
    public void user_enters_student_password() {
    }

    /**
     * Student Part below
     * */

    @When("I login using {string} and {string}")
    public void i_login_using_and(String string, String string2) {

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

    }
    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {

    }
}
