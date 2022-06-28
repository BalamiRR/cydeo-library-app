package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base{

    @FindBy(id = "inputEmail")
    public WebElement inputUserName;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

}
