package org.example.External;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomationDemo extends TestNGAutomationDemo {

    @Test
    public void DemoTest() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {

        // Financial banking application - account trasnfer screen.
        // Login page  - 10 elements
        // Dashboard -   15 elements 
        // Account - Details -  10 elements
        // Account Transfer - 10 elements
        // Account - international transfer - 10 elements
        // Loan application - 10 elements
        // SEarch
        // Contact US
        // Logout - 5 elements
        // Title  - Account - Intra transfer  -    300 Elements 

        // 200 elements to be captured using locator strategy (id, name, xpath
        //, csslocator, linktext, partiallinktext, classname, tagname)

        // 1000 Test cases -  (should you hae 1000 test scripts, )
        //   6 Modules - Each module cn be represented as a Test script class
        //  Feature wise split up - 20 Features -  20 Test script class
        

        // Login ( 6 Test Cases )  - 20 Web Elements 
        //    Successful Login  
        //    Unsuccessful Login
        //    Forgot Password
        //    Change Password
        //    Account Lock Scenario 
        

        // 1 Test script that will test 5 functionlaites (TCS)




        // Web application will have pages  - 
        // each page will ahve list of web elements



        // WebDriver object can be created in 3 different ways
        // 1. Direct - below example
        // 2. WebDriverManager - use this // WNS environment will work only on this
        // method
        // 3. RemoteWebDriver - Builder method - use this

        // System.out.println("Hello World");

        // Locate, check the presence, act then assert

        // AAA - Arrange, Act, Assert

        // to manage the latency there are multiple approaches available
        // 1. Thread.sleep(1000) - not recommended
        // 2. Implicit wait - driver.manage().timeouts().implicitlyWait(10,
        // TimeUnit.SECONDS)
        // 3. Explicit wait - WebDriverWait wait = new WebDriverWait(driver, 10); -
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someid
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();
        // Thread.sleep(1000); // not recormmended

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // explicit wait - provides more configurable options
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        // wait.pollingEvery(Duration.ofSeconds(2));
        // wait.ignoring(NotFoundException.class);
        // wait.withMessage("Report search element is not found on the page ");

        // open the url

        driver.get("https://www.google.com/");

        // check if the google page has come up
        String pageTitle = driver.getTitle();
        // verify the title
        if (pageTitle.equals("Google")) {
            System.out.println("Test Passed");
            assert true;
        } else {
            System.out.println("Test Failed");
            assert false;
        }

        // locate the search box
        WebElement searchBox = driver.findElement(By.name("q"));

        if(!Utility.InputData(searchBox, "Selenium"))
        {
            System.out.println("Search box is not displayed and enabled");
            assert false;
        }

        // verify if search box is displayed and enabled
        if (searchBox.isDisplayed() && searchBox.isEnabled()) {
            System.out.println("Search box is displayed and enabled");
            searchBox.clear();
            searchBox.sendKeys("Selenium"); // type in the search box
            assert true;
        } else {
            System.out.println("Search box is not displayed and enabled");
            assert false;
        }

        // verify if search result has come up
        WebElement searchButton = driver.findElement(By.name("btnK"));

        if (searchButton.isDisplayed() && searchButton.isEnabled()) {
            System.out.println("Search button is displayed and enabled");
            searchButton.click();
            assert true;
        } else {
            System.out.println("Search button is not displayed and enabled");
            assert false;
        }

        // verify the title again
        String pageTitle1 = driver.getTitle();

        // if you want to verify the particular element within the result page

        if (pageTitle1.contains("Selenium")) {
            System.out.println("Test Passed");
            assert true;
        } else {
            System.out.println("Test Failed");
            assert false;
        }

    }

   

}
