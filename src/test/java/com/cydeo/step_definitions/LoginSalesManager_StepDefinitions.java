package com.cydeo.step_definitions;

import com.cydeo.pages.LoginSalesManager_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSalesManager_StepDefinitions {

  LoginSalesManager_Page loginSalesManager_page=new LoginSalesManager_Page();


    @When("user go to main page")
    public void user_go_to_main_page() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
    }


    @When("user enters username data")
    public void user_enters_username_data() {
     // WebElement username = Driver.getDriver().findElement(By.id("login"));
    //username.sendKeys("salesmanager100@info.com");
     loginSalesManager_page.username.sendKeys("salesmanager100@info.com");



    }
    @When("user enters password data")
    public void user_enters_password_data() {

  loginSalesManager_page.password.sendKeys("salesmanager");
    }
    @When("user can see top on the screen him|her username")
    public void user_can_see_top_on_the_screen_him_her_username() {
        WebElement loginButton=Driver.getDriver().findElement(By.xpath("//button[.='Log in']"));
        loginButton.click();

        WebElement user =Driver.getDriver().findElement(By.className("o_user_menu"));
        System.out.println("user.getText() = " + user.getText());


    }



    @Then("user can see expected title on the page")
    public void user_can_see_expected_title_is_page() {
        String expectedTitle="Odoo";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }


    @Given("User username and password")
    public void userUsernameAndPassword() {
    }
}
