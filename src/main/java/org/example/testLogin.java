package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class testLogin {

    // Capture 20 Elements 
    // if the application has 50 web pages , then create 50 page classes
    // Delink user action from the web element initialization

    // I would refer pageLogin class
 
    // add construtor to initialize the web elements
    WebDriver driver = new ChromeDriver();
    pageLogin page = new pageLogin(driver);
    
 


   // @Test
    public void testSuccessfulLogin(){

        // input user name in the user name text box
        // input passowrd in the password text box

        // WebElement userName = driver.findElement(By.id("email"));
        // userName.sendKeys("admin");

        // WebElement password = driver.findElement(By.id("password"));
        // password.sendKeys("admin");

        // WebElement loginButton = driver.findElement(By.id("login"));
        // loginButton.click();
        // page.userName.sendKeys("admin");
        // page.password.sendKeys("admin");
        page.LoginWithUserNameAndPassword("admin", "admin");
        System.out.println("Successful Login");
    }

    public void testUnsuccessfulLogin(){


        /// For NAvigation alone I hae created one page class
        //   pageNavigation

       

      //  page.userName.sendKeys("admin");
      //  page.password.sendKeys("admin");
        // WebElement userName = driver.findElement(By.id("email"));
        // userName.sendKeys("admin");

        // WebElement password = driver.findElement(By.id("password"));
        // password.sendKeys("invalid password");

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        System.out.println("Unsuccessful Login");
    }

    public void testForgotPassword(){
        System.out.println("Forgot Password");
    }

    public void testChangePassword(){
        System.out.println("Change Password");
    }

    public void testAccountLockScenario(){
        System.out.println("Account Lock Scenario");
    }

    
}
