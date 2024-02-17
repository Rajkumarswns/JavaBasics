package org.example;

import java.io.Console;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try
        {
        // create webdriver object to use chrome browser
        WebDriver driver = new ChromeDriver();

        // configure implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://127.0.0.1:3000/src/main/java/org/example/demo.html");
        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        // assert the title "Selenium - Google Search"
        if(driver.getTitle().equals("Selenium Locator Strategy Demo Site")){
            System.out.println("Test Passed");
            // use assert to fail the test
            assert true;
        }


        // Find web element by id
        WebElement EmployeeID = driver.findElement(By.id("employeeId"));
        if(EmployeeID.isDisplayed()){
            // write message to console
            System.out.println("Employee ID is displayed");
             EmployeeID.clear();
            EmployeeID.sendKeys("12345");  
            assert true; 
        }

        // Find Web element by name
        WebElement EmployeeName = driver.findElement(By.name("employeeName"));
        if(EmployeeName.isDisplayed()){
            // write message to console
            System.out.println("Employee Name is displayed");
            EmployeeName.clear();
            EmployeeName.sendKeys("John Doe"); 
            assert true;
        }

        // Get the dob element whose type is input
        WebElement dob = driver.findElement(By.xpath("//input[@type='date']"));
        if(dob.isDisplayed()){

              // write message to console
            System.out.println("Date of Birth is displayed");
            dob.clear();
            dob.sendKeys("02/02/2017");
             assert true;
        }
        
        // get the Male from the Gender Dropdown
        WebElement Gender = driver.findElement(By.id("GenderInput"));

        if (Gender.isDisplayed()) {
            // write message to console
            System.out.println("Gender drop down is displayed");
            // Create Select object
            Select genderSelect = new Select(Gender);
            // Select the option with Male
            genderSelect.selectByVisibleText("Male");
        }

        WebElement langRadioButton   = driver.findElement(By.id("html"));
        if(langRadioButton.isDisplayed()){
            // write message to console
            System.out.println("Language radio button is displayed");
            langRadioButton.click();
            assert true;
        }

        // locate the url with the partial text oo and click
        WebElement url = driver.findElement(By.linkText("Yahoo"));
        System.out.println(url.getAttribute("href"));

        if(url.isDisplayed()){
            // write message to console
            System.out.println("URL is displayed");
            var url1 = url.getAttribute("href");

            // open the url in a seperate tab
            JavascriptExecutor js = (JavascriptExecutor) driver;
            
            // open the url1 in the new tab
            js.executeScript("window.open('"+url1+"')");
            
            // click on the first tab
            driver.switchTo().window(driver.getWindowHandle());

            assert true;
        }

        // get the address1 element from iframe with the id addressiframe
        driver.switchTo().frame("addressiframe");
        WebElement address1 = driver.findElement(By.id("address1"));
        if(address1.isDisplayed()){
            // write message to console
            System.out.println("Address1 is displayed");
            address1.clear();
            address1.sendKeys("1234 Main Street");
            assert true;
        }   

        // switch back to the main window
        //driver.switchTo().defaultContent();
        driver.switchTo().window(driver.getWindowHandle());

        
        // click on submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        if(submitButton.isDisplayed()){
            // write message to console
            System.out.println("Submit button is displayed");
            submitButton.click();
            assert true;

            // click on the alert window
             
            System.out.println("Alert message is displayed");

            driver.switchTo().alert().accept();
            assert true;


        }
          


 
        Thread.sleep(3000);

        // add explicit wait
    
        driver.quit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        //verify the title of the browser
       
          
        
        
    }
    
}
