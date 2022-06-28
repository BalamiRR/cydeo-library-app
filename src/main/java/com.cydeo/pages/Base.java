package com.cydeo.pages;

import org.openqa.selenium.support.PageFactory;
import com.fuatkara.utilities.Driver;

public class Base {
    /**In this class we will store WebElement common to all
     * */
    public Base(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
