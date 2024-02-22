package org.example.oops;

import java.util.*;

import org.openqa.selenium.By;

public class DemoCalculator {

    public static void main(String[] args) {

        // What is automation ?
        // manual effort reduced - time saving / faster result  early feedback

        //  to get rid the monotony of the work - > you will be creative do the work which is more interesting
        // we make the sysetm to do the tesitng on our half
        // can we automate all cases is it for 100 % automation ?
        // no - limitation of the tool,  functionality itself complex.....

        // pre-requisite for automation
    // 1. System should be stable, basic flows are working fine
    // 2. Manual test cases should be in place 
    // 3.  Clear cut explanation of the functionality in term of steps & expected resul
    

    // Sample TC
    /*
     * 1. Open the browser
     * 2. Navigate to the URL   -- which url I should use
     * 3. Enter the username  --  data to be captured 
     * 4. Enter the password   -- captured 
     * 5. Click on the login button
     * 6. Verify the home page is displayed  -- Explicit verificaiton is neeeded
     * 
     * 
     * Qualify the expected result ->look fo r text, look for gif, look for button
     * 
     * 
     */
            ///  precondition that shoudl exist 
     // Account transfer TC
     //  Test Data :  Source account, destination
     //source account with sufficint balance 
     /* 0. login to application with valid credentials ( username, password)
      * 1. Select source account
      2. Select destination account
        3. Enter the amount
        4. Click on the transfer button
        5. Verify the success message
        6. use the target account
        7. do a payment 
      */
        /// precondition documented...  setup acccount, crednetial, data 

        // 50 times ....   what is missing  ?

        // post execution - need to clearn

        // closing the browser

        // When you write test script it should independent script 
        // it shoudl do the required setup 
        // it should perform the requied actions
        // it should do the validtion
        // bring the system back to its normal state, to that the script can be run
        // again and again
        // exit critier.  we will askthe tester to run the script consequetively 2 times

        /// fails becasue of the time out/ synchronization issue
        // beacuse preconditon setup failure
        // post clean up


        // AAA - Arrange (setup ), Act (perform action), Assert ( validation)

        // Test case, test script quality 

        // 1. Go through application - understand Application / functionality
        // 2. Review the test cases
        // 3. Find out why automation needed, how many times the same TC getting executed
        // 4. Find the life time of the project is it one off development OR is there 
        // more releases planned or not
        // 5. what is the current state the application  (stable, defect free)
        // what is the technology used  especially the front end technology
        // what is the complexity of seting up the test data

        // Piloting the automation -  
            // functional perspective ( Medium , complex test cases )
            /// from technical perspecetive / tool perspective challenging UI

        // 10 to 15 test cases, do the automation and prove its technical feasibility

        /// 

        // Calculator calculator = new Calculator();
        // System.out.println(calculator.add(10, 20));
        // System.out.println(calculator.subtract(10, 20));
        // System.out.println(calculator.multiply(10, 20));

 
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        scientificCalculator.name = "Casio";
        scientificCalculator.price = 1000;
        System.out.println(scientificCalculator.sin(90));
        System.out.println(scientificCalculator.cos(90));
        System.out.println(scientificCalculator.tan(90));
        System.out.println(scientificCalculator.add(10, 20));
        // delcare array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(scientificCalculator.add(numbers));

        ScientificCalculator scientificCalculator1 = new ScientificCalculator("Raj", 2000);



        BasicCalculator basicCalculator = new BasicCalculator();
        basicCalculator.name = "SEICO";
        basicCalculator.price = 1000;
        System.out.println(basicCalculator.add(10, 20));
        System.out.println(basicCalculator.subtract(10, 20));
        System.out.println(basicCalculator.multiply(10, 20));

        // DRY - Don't Repeat Yourself

        // Automation perspective the example.

        // BaseClass - invoke browser,  close browser, open the data file
        // inhertiance concept is used while preparing the script

        // LoginScript - >  inherit baseclass
        // AccountScript -  >   
        // SearchScript -  >   


        BasicCalculator.divide(10,2);  // static  non instance methods
        BasicCalculator.Manufacturer = "Nitin Co";

        System.out.println(BasicCalculator.Manufacturer);

 
    }
    
}
