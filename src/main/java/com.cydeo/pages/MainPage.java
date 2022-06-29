package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base{

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

    @FindBy(id = "user_count")
    public WebElement userCount;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersText;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountHolderName;
}