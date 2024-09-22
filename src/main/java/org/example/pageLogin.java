package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLogin  {

    // Weblements,  related action that you can perform on that web element

    // easily maintainable

    // capture the acton specific logic in the page class so that your test script become
    // very light and easily maintable.
    // page object model 

    @FindBy(name = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    // constructor
    public pageLogin(WebDriver driver) {
        // do the intialization 
        PageFactory.initElements(driver,this);
    }

    public  void LoginWithUserNameAndPassword(String userName, String pwd) {
        username.sendKeys(userName);
        password.sendKeys(pwd);

        // declare webleement
        // this weblemen to be intiaillzed using  the respective locator strategy
        // then you use the element to perform the action
    }   
    
}
