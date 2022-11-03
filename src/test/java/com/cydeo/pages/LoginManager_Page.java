package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginManager_Page {

    public LoginManager_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//label[.='Password']")
    public WebElement verifyPassword;

    @FindBy(xpath = "//span[.='SalesManager100']")
    public WebElement verifyLogged;

@FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongMail;







}
