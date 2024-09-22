package org.example.External;

import org.openqa.selenium.WebElement;

public  class Utility {
    
     public static Boolean InputData(WebElement element, String data) {
        try {
            if (element.isDisplayed() && element.isEnabled()) {
                element.clear();
                element.sendKeys(data);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    // add a function add two numbers

    public int add()
    {
        return 0;
    }

}
