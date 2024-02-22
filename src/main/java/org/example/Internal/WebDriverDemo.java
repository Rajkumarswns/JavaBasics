package org.example.Internal;

import java.io.Console;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {

            // create chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            // create webdriver object to use chrome browser
            WebDriver driver = new ChromeDriver();

            // maximize the browser window
            driver.manage().window().maximize();

            // configure implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("http://127.0.0.1:3000/src/main/java/org/example/demo.html");
            Thread.sleep(1000);

            System.out.println(driver.getTitle());

            // assert the title "Selenium - Google Search"
            if (driver.getTitle().equals("Selenium Locator Strategy Demo Site")) {
                System.out.println("Test Passed");
                // use assert to fail the test
                assert true;
            }

            // Find web element by id
            WebElement EmployeeID = driver.findElement(By.id("employeeId"));
            if (EmployeeID.isDisplayed()) {
                // write message to console
                System.out.println("Employee ID is displayed");
                EmployeeID.clear();
                EmployeeID.sendKeys("12345");
                assert true;
            }

            // Find Web element by name
            WebElement EmployeeName = driver.findElement(By.name("employeeName"));
            if (EmployeeName.isDisplayed()) {
                // write message to console
                System.out.println("Employee Name is displayed");
                EmployeeName.clear();
                EmployeeName.sendKeys("John Doe");
                assert true;
            }

            // Get the dob element whose type is input
            WebElement dob = driver.findElement(By.xpath("//input[@type='date']"));
            if (dob.isDisplayed()) {

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

            WebElement langRadioButton = driver.findElement(By.id("html"));
            if (langRadioButton.isDisplayed()) {
                // write message to console
                System.out.println("Language radio button is displayed");
                langRadioButton.click();
                assert true;
            }

            // locate the url with the partial text oo and click
            WebElement url = driver.findElement(By.linkText("Yahoo"));
            System.out.println(url.getAttribute("href"));

            if (url.isDisplayed()) {
                // write message to console
                System.out.println("URL is displayed");
                var url1 = url.getAttribute("href");

                // open the url in a seperate tab
                JavascriptExecutor js = (JavascriptExecutor) driver;

                // open the url1 in the new tab
                js.executeScript("window.open('" + url1 + "')");

                // click on the first tab
                driver.switchTo().window(driver.getWindowHandle());

                assert true;
            }

            // get the address1 element from iframe with the id addressiframe
            driver.switchTo().frame("addressiframe");
            WebElement address1 = driver.findElement(By.id("address1"));
            if (address1.isDisplayed()) {
                // write message to console
                System.out.println("Address1 is displayed");
                address1.clear();
                address1.sendKeys("1234 Main Street");
                assert true;
            }

            // // switch back to the main window
            // //driver.switchTo().defaultContent();
            driver.switchTo().window(driver.getWindowHandle());

            // get row count from the table
            WebElement table = driver.findElement(By.xpath("//table"));
            if (table.isDisplayed()) {
                // write message to console
                System.out.println("Table is displayed");
                // get the row count
                var rowCount = table.findElements(By.tagName("tr")).size();
                System.out.println("Row count is " + (rowCount - 1));
                assert true;
            }

            // iterate throgh table body and get the cell value
            var tableBody = table.findElement(By.tagName("tbody"));
            var rows = tableBody.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                var cells = row.findElements(By.tagName("td"));
                for (WebElement cell : cells) {
                    System.out.println(cell.getText());
                }
            }

            /*
             * WebElement rangeSlider =
             * driver.findElement(By.xpath("//input[@type='range']"));
             * if(rangeSlider.isDisplayed()){
             * // write message to console
             * System.out.println("Range slider is displayed");
             * String initValue = rangeSlider.getAttribute("value");
             * System.out.println("Initial value is " + initValue);
             * for(int i=0; i<5 ; i++){
             * rangeSlider.sendKeys(Keys.ARROW_RIGHT);
             * }
             * String finalValue = rangeSlider.getAttribute("value");
             * System.out.println("Final value is " + finalValue);
             * 
             * assert true;
             * }
             * 
             * // color picket demo
             * WebElement colorPicker =
             * driver.findElement(By.xpath("//input[@type='color']"));
             * if(colorPicker.isDisplayed()){
             * // write message to console
             * System.out.println("Color picker is displayed");
             * colorPicker.clear();
             * colorPicker.sendKeys("#ff0000");
             * assert true;
             * }
             */
            getScreenShot((ChromeDriver) driver, "alert.png");

            // click on submit button
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
            if (submitButton.isDisplayed()) {
                // write message to console
                System.out.println("Submit button is displayed");
                submitButton.click();
                assert true;

                // click on the alert window

                System.out.println("Alert message is displayed");


                driver.switchTo().alert().accept();
                assert true;
                // switch back to main window

            }

            Thread.sleep(300);

            // add explicit wait

            driver.quit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void getScreenShot(ChromeDriver driver, String fileName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        Path path = Paths.get(System.getProperty("user.dir"), "screenshots");//, fileName);
        try {
            Files.copy(screenshot, path.toFile());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
