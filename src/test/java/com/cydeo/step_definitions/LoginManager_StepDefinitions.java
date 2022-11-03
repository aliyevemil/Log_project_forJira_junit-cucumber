package com.cydeo.step_definitions;

import com.cydeo.pages.LoginManager_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginManager_StepDefinitions {

  LoginManager_Page loginManager_page = new LoginManager_Page();

  @Given("user username and user password.")
  public void user_username_and_user_password() {

  }
  @When("user go to main page")
  public void user_go_to_main_page() {
Driver.getDriver().get("https://qa.upgenix.net/web/login");
  }
  @When("user enters username {string}")
  public void user_enters_username(String string) {
    loginManager_page.username.sendKeys("salesmanager100@info.com");
  }




  @When("user enters password {string}")
  public void user_enters_password(String string) {
loginManager_page.password.sendKeys("salesmanager");

  }




  @When("user clicks login button")
  public void user_clicks_login_button() {
    loginManager_page.logInButton.click();
  }
  @When("User should see the password in bullet signs")
  public void user_should_see_the_password_in_bullet_signs() {
    loginManager_page.verifyPassword.getText();



  }

  @Then("Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.")
  public void verify_if_the_enter_key_of_the_keyboard_is_working_correctly_on_the_login_page() {

  }
  @Then("user can see top on the screen him|her username")
  public void user_can_see_top_on_the_screen_him_her_username() {
loginManager_page.verifyLogged.isDisplayed();

  }
  @Then("user can see expected title on the page")
  public void user_can_see_expected_title_on_the_page() {
    String title= Driver.getDriver().getTitle();
    String expectedTitle="Odoo";
    Assert.assertEquals(title,expectedTitle);
  }


  @When("user enters wrong username {string}")
  public void user_enters_wrong_username(String string) {
    Driver.getDriver().get("https://qa.upgenix.net/web/login");

loginManager_page.username.sendKeys("salesmanager@info.com");

  }
  @When("user enters wrong password {string}")
  public void user_enters_wrong_password(String string) {
    loginManager_page.password.sendKeys("salesmanager100");
    loginManager_page.logInButton.click();

  }


  @When("user enters invalid password {string};")
  public void user_enters_invalid_password(String string) {

  }

  @When("user enters invalid username {string}")
  public void user_enters_invalid_username(String string) {

  }



  @When("user without filling the blanks click login button")
  public void user_without_filling_the_blanks_click_login_button() {

  }
  @Then("{string} message should be displayed")
  public void message_should_be_displayed(String string) {

loginManager_page.wrongMail.isDisplayed();
  }
  @When("user without filling the username blank")
  public void user_without_filling_the_username_blank() {

  }
  @When("user enters valid password {string}")
  public void user_enters_valid_password(String string) {

  }

  @Then("user enters valid username {string}")
  public void user_enters_valid_username(String string) {

  }
  @When("user without filling the password blank")
  public void user_without_filling_the_password_blank() {

  }
}