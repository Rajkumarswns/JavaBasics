package org.example.External;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAutomationDemo {
 

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }

    @AfterTest
    public void AfterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    

}
