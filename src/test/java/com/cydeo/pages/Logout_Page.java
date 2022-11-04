package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {

    public Logout_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "login")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;


    @FindBy(xpath ="//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(className = "oe_topbar_name")
    public WebElement usernameButton;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;

@FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement backMessage;

@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButton;

@FindBy(xpath ="//img[@src='/web/binary/company_logo']")
    public WebElement logo;

}
