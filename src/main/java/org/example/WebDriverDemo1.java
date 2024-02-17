package org.example;

import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverDemo1 {
    // Creation of web driver 
    // Method 1. Directly create instance of it

    public static void main(String[] args)
    {
        // Create ChromeWebDriver

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("latest");
       // capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);

        var url = "http://localhost:4444/";
        // convert url to URI
        URI uri = URI.create(url);
 
        try{
            // create RemoteWebDriver with capabilities
            RemoteWebDriver rw  = new RemoteWebDriver (new URL(url), capabilities);
            rw.get("https://www.google.com");
            System.out.println(rw.getTitle());
            rw.quit();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     
      
        // WebDriver driver = new ChromeDriver();


        

        // // what is browser capabilities
        // // 1. it helps to set the properties of browser
        // // 2. it helps to get the properties of browser
        // // 3. below are few properties that can be set or get
        // // 4. browser name, browser version, platform, platform name, platform version, acceptInsecureCerts, pageLoadStrategy, proxy, setWindowRect, timeouts, unhandledPromptBehavior
        // // set browser name
     
    


  

        // // from capabilities parse it as json and print key and value
 
        // var res = capabilities.asMap();
        // for (var entry : res.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // // maximize the browser window
 
        // // create ChromeOptions and set the details
        // ChromeOptions options3 = new ChromeOptions();
        // options3.addArguments("--disable-extensions");
        // options3.addArguments("--disable-popup-blocking");
        // options3.addArguments("--start-maximized");

        // // create ChromeWebDriver with options
        // WebDriver driver1 = new ChromeDriver(options3);

        // driver1.get("https://www.google.com");
        // driver1.manage().window().maximize();

        // System.out.println(driver1.getTitle());
        // System.out.println(driver1.getCurrentUrl() ); 
        // driver1.navigate().to("https://www.facebook.com");
        // driver1.navigate().back();
        // driver1.navigate().forward();
        // driver1.navigate().refresh();


        // driver.quit();
        // driver1.quit();

        // WebDriver Methods 
        // get() : Load a new web page in the current browser window. This is done using an HTTP GET operation, and the method will block until the load is complete.   
        // getTitle() : Get the title of the current page.
        // getCurrentUrl() : Get a string representing the current URL that the browser is looking at.
        // getPageSource() : Get the source of the last loaded page.
        // getWindowHandle() : Return an opaque handle to this window that uniquely identifies it within this driver instance.




          


     
    
    }
    
}
