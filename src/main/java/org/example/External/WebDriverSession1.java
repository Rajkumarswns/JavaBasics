package org.example.External;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSession1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // The hierarchy of the WebDriver class is as follows:
        // WebDriver -> RemoteWebDriver -> ChromeDriver

        // Arrange
        // Create the instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Act
        // Open the application
        driver.get("https://www.google.com");

        // Assert

        // Get the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        // verify the title of the page
        if (driver.getTitle().equals("Google")) {

            assert driver.getTitle().equals("Google") : "Title is correct";

            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }

        // locate the webElement of Search Text box
        // WebElement searchTextBox = driver.findElement(By.name("q"));

     

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchTextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

        // FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
        // fwait.withTimeout(Duration.ofSeconds(10));
        // fwait.pollingEvery(Duration.ofSeconds(2));
        // fwait.ignoring(Exception.class);
        // WebElement searchTextBox1 = fwait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));


 
        // WebElement searchTextBox1 =
        // wait.until(ExpectedConditions.presenceOfElementLocated(
        // By.name("q") ));

        if (searchTextBox.isDisplayed()) {
            System.out.println("Search Text box is displayed");
        } else {
            System.out.println("Search Text box is not displayed");
        }

        // Enter the text in the search text box
        searchTextBox.sendKeys("Selenium");
        // Press Enter
        searchTextBox.submit();

        // verify the title of the page
        if (driver.getTitle().contains("Selenium")) {
            System.out.println("Title is correct");
        } else {
            System.out.println("Title is incorrect");
        }

        // Close the browser
        driver.quit();

        // Explain explicit wait
        // what is Selenium web driver explicit wait ?
        // An explicit wait is code you define to wait for a certain condition to
        // occur before proceeding further in the code. The worst case of this is
        // Thread.sleep(), which sets the condition to an exact time period to wait.

        // html table management

        // Step 1. Find the Table
        WebElement table = driver.findElement(By.id("table"));
        // Step 2. Find the rows in the table
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        // get the count
        System.out.println("Number of rows in the table: " + rows.size());
        // Step 3. Find the columns in the table
        java.util.List<WebElement> columns = table.findElements(By.tagName("td"));
        // get the count
        System.out.println("Number of columns in the table: " + columns.size());
        // iterate through the table
        for (WebElement row : rows) {
            java.util.List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.println(col.getText());
            }
        }

    }

}
