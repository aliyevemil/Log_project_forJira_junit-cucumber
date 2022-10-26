package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSalesManager_Page {

    public LoginSalesManager_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;


}
