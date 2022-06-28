package com.cydeo.step_definitions;

import com.cydeo.pages.Login;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.fuatkara.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginSD {

    Login login = new Login();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        login.inputUserName.sendKeys("librarian1@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        login.inputPassword.sendKeys("rs4BNN9G" + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(login.userAvatar.isDisplayed());
    }

    /**
     * Student Part below
     * */

    @When("user enters student username")
    public void user_enters_student_username() {
        login.inputUserName.sendKeys("student1@library");
    }

    @And("user enters student password")
    public void user_enters_student_password() {
        login.inputPassword.sendKeys("i2A9TgXa" + Keys.ENTER);
    }

    /**
     *
     *
     *
     * **/

    @When("user enters librarian {string}")
    public void user_enters_librarian(String librarianName) {
        login.inputUserName.sendKeys(librarianName);
    }

    @And("user enters librarian password {string}")
    public void userEntersLibrarianPassword(String userPassword) {
        login.inputPassword.sendKeys(userPassword);
    }

    @When("user enters student {string}")
    public void user_enters_student(String librarianPass) {
        login.inputUserName.sendKeys(librarianPass + Keys.ENTER);
    }

    @And("user enters student password {string}")
    public void userEntersStudentPassword(String librarianPass) {
        login.inputPassword.sendKeys(librarianPass + Keys.ENTER);
    }


    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String pass) {

    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

    }

    @Then("there should be {int} {string}")
    public void there_should_be(Integer int1, String string) {

    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {
    }

}
