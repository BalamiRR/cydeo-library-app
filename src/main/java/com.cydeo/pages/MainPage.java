package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base{

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

    @FindBy(id = "user_count")
    public WebElement userCount;

}