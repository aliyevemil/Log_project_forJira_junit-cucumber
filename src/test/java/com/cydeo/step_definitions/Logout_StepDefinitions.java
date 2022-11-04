package com.cydeo.step_definitions;

import com.cydeo.pages.Logout_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    Logout_Page logout_page = new Logout_Page();


    @Given("user go to login page")
    public void user_go_to_login_page() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
    logout_page.username.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        logout_page.password.sendKeys(password);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        logout_page.loginButton.click();
    }

    @When("user clicks username")
    public void user_clicks_username() {
        logout_page.usernameButton.click();
    }

    @When("user clicks log out button")
    public void user_clicks_log_out_button() {
    logout_page.logoutButton.click();
    }


    @Then("user can see expected title on the page {string}")
    public void userCanSeeExpectedTitleOnThePage(String title) {
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(title,actualTitle);
    }



    @When("user clicks back button")
    public void userClicksBackButton() {
        Driver.getDriver().navigate().back();
    }

    @And("user see the description on the page")
    public void userSeeTheDescriptionOnThePage() {
       logout_page.backMessage.isDisplayed();

    }

    @And("user can not go to the home page")
    public void userCanNotGoToTheHomePage() {
        logout_page.okButton.click();

    }


    @Then("user can see logo the login page")
    public void userCanSeeLogoTheLoginPage() {
    logout_page.logo.isDisplayed();
    }
}
