package org.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // create webdriver object to use chrome browser
        WebDriver driver = new ChromeDriver();

        // configure implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        //hit enter key
        driver.findElement(By.name("q")).submit();

        // add explicit wait
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        //verify the title of the browser
        System.out.println(driver.getTitle());

        // assert the title "Selenium - Google Search"
        if(driver.getTitle().equals("Selenium - Google Search")){
            System.out.println("Test Passed");
            // use assert to fail the test
            assert true;
        }

          
        driver.quit();
        
        
    }
    
}
