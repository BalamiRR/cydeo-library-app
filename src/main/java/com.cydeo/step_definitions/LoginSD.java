package com.cydeo.step_definitions;

import com.cydeo.pages.LoginP;
import com.cydeo.pages.MainPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginSD {

    LoginP loginP = new LoginP();
    MainPage mainPage = new MainPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginP.inputEmail.sendKeys("librarian1@library");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginP.inputPassword.sendKeys("rs4BNN9G" + Keys.ENTER);
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(mainPage.userAvatar.isDisplayed());
    }

    //Student
    @When("user enters student username")
    public void user_enters_student_username() {
        loginP.inputEmail.sendKeys("student1@library");
    }

    @And("user enters student password")
    public void user_enters_student_password() {
        loginP.inputPassword.sendKeys("i2A9TgXa" + Keys.ENTER);
    }

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String librarianName) {
        loginP.inputEmail.sendKeys(librarianName);
    }

    @And("user enters librarian password {string}")
    public void userEntersLibrarianPassword(String userPassword) {
        loginP.inputPassword.sendKeys(userPassword + Keys.ENTER);
    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String librarianPass) {
        loginP.inputEmail.sendKeys(librarianPass);
    }

    @And("user enters student password {string}")
    public void userEntersStudentPassword(String librarianPass) {
        loginP.inputPassword.sendKeys(librarianPass + Keys.ENTER);
    }

    //LoginWith Different User
    @When("I login using {string} and {string}")
    public void i_login_using_and(String email, String pass) {
        loginP.inputEmail.sendKeys(email);
        loginP.inputPassword.sendKeys(pass + Keys.ENTER);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        user_should_see_the_dashboard();
    }

    @Then("there should be {int} {string}")
    public void there_should_be(String number, String user) {
    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {
    }





}