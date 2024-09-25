package org.example.Internal;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class LocatorStrategyDemo {
    
    public static void main(String argc[])
    {

 // create chrome options  https://peter.sh/experiments/chromium-command-line-switches/

 try{
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


// compound locators

        // By Id or Name
           WebElement empName = driver.findElement(new ByIdOrName("employeeName"));
           empName.sendKeys("Rajkumar");

           // By Chained
           List<WebElement> tableRows = driver.findElements(new ByChained(By.tagName("table"),
           By.tagName("tbody"), By.tagName("tr")));

           System.out.println(tableRows.size());
           for(WebElement row : tableRows)
           {
                    System.out.println(row.getText());
           }

           // By All
           List<WebElement> radiobuttonElements = driver.findElements(new ByAll(By.tagName("input"),
           By.cssSelector("[type='color']"),By.name("my-colors")));

           System.out.println(radiobuttonElements.size());
           for(WebElement element : radiobuttonElements)
           {
                    System.out.println(element.isDisplayed());
           }

           // relative

           // Locate the Date of Birth input field
           WebElement dobInput = driver.findElement(By.xpath("//input[@type='date' and @class='form-control']"));

           // Locate Employee Name input field using Relative Locator
           WebElement employeeNameInput = driver.findElement(
                   RelativeLocator.with(By.tagName("input")).above(dobInput));

           System.out.println(employeeNameInput.getAttribute("placeholder"));

           // wait for 10 seconds
            dobInput = driver.findElement(By.xpath("//input[@type='date' and @class='form-control']"));

   // Locate Select Gender dropdown using Relative Locator
   WebElement selectGenderDropdown = driver.findElement(
      RelativeLocator.with(By.tagName("select")).below(dobInput));

// Print the ID attribute value to ensure correct element is located
System.out.println(selectGenderDropdown.getAttribute("id"));
            

           // Print the placeholder attribute value to ensure correct element is located
          // 
           

            driver.quit();


 }catch(Exception ex)
 {
    System.out.println(ex.getMessage());
 }

    }
}
