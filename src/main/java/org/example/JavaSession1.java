package org.example;

import java.util.Scanner;

public class JavaSession1 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // primitive data type supported by Java
        //  int, float, double, char, boolean

        DataTypeDemo();

        InputDemo();
         
        ifDemo();   

        LoopDemo();

        ArrayDemo();

        ExceptionHandler();

    }

    private static void ExceptionHandler() {
        // all the time we think things will go as planned.... 
        // in reality it is not so most ofthe time you may encouter error /issues
        // Exception handler
          // handle the here may be just report the user what has happend
        // and graciously exit the program

        // as per below code if the error happend at line 36 then line # 39 will not execute
        // control goes to respective catch block and then finally block

        try {

            String Names[] = { "Rajkumar", "Nitin", "Karthik", "Varun", "Ankur" };
            // print the values
            for (int i = 0; i < 6; i++) {
                System.out.println(Names[i]);
            }

            System.out.println(" here is my code aftere exectuing for loop");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("while reading array index is out of bound check the index value");

        } catch (Exception e) {
            System.out.println("There seem to be something gone wrong " + e.getMessage());

        } finally {
            // close the database connection
            // close the file reader
            System.out.println("Regardless of error has happend or not, this block will always execute");
        }
    }

    private static void ArrayDemo() {
        // if you want to store 5 names 
        
        String name1 = "Rajkumar";
        String name2 = "Nitin";
        String name3 = "Karthik";
        String name4 = "Varun";
        String name5 = "Ankur";

        // Array help to store multiple values of in a single variable 
        // Array initial index is 0
        // Array is a collection of similar type of data
        // Array is a fixed size
        String UserNames[] = {"Rajkumar", "Nitin", "Karthik", "Varun", "Ankur"};

        // System.out.println(UserNames[0]);
        // System.out.println(UserNames[1]);
        // System.out.println(UserNames[2]);
        // System.out.println(UserNames[3]);
        // System.out.println(UserNames[4]);

        // print the UserNames using for loop
        for (int i = 0; i < UserNames.length; i++) {
            System.out.println(UserNames[i]);
        }


        // iterate using foreach loop
        for (String name : UserNames) {
            System.out.println(name);
        }

        // String names[] = new String[5];  // declare an array with size 5
        // names[0] = "Rajkumar";
        // names[1] = "Nitin";
        // names[2] = "Karthik";
        // names[3] = "Varun";
        // names[4] = "Ankur";



      
        // to Access the values from the array you will use index
        // Array index always starts from 0
        // Array can be used only to store the same type of data
        

        // Array combined with forloop is a common scenario in the automation
    }

    private static void LoopDemo() {
        // loop - you want to excute the same statement multiples times.
        // print my name 5 times
        String myName = "Rajkumar";
        System.out.println(myName);
        System.out.println(myName); 
        System.out.println(myName);
        System.out.println(myName); 
        System.out.println(myName);

        // print my name using for loop
        

        // in the autoamtion, you want to test the login functionality with 5 
        //different user and password
        for (int i = 1; i == 5; i++) {
            System.out.println(myName);
        }
        
        // while loop
        // print my name 10 times using while loop
        int i = 6;
        while (i <= 5) {
            System.out.println(myName);
            i++;
        }


        // do while loop
        // print my name 10 times using do while loop -- guaranteed to execute at least once
        int j = 1;
        do {
            System.out.println(myName);
            j++;
        } while (j <= 5);
    }

    private static void ifDemo() {
        String myName = "Rajkumar";
        int myAge = 20;  // it is an assignment operator

        // relational operator
        // >, <, >=, <=, ==, !=  
        if (myAge >= 18) 
        {
            System.out.println("Hello " + myName + " you are major");
        } 
        else 
        {
            System.out.println("Hello " + myName + " you are minor");
        }

        // nested if demo
        int a = 100;
        int b = 200;
        int c = 300;

        // find the biggest number using if else statements

        if(a > b && a > c) {
            System.out.println("a is the biggest number");
        } else if (b > c) {
            System.out.println("b is the biggest number");
        } else {
            System.out.println("c is the biggest number");
        }





    }

    private static void InputDemo() {

              // how to get the input from the user
        // Scanner class
        // GEt user name from the user
        String myName;

        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);   // creating a instance of a class
        System.out.println("Enter your name: ");  // Display the message to the user
        myName = scanner.nextLine();                // get the input from the user
        System.out.println("Hello " + myName);      // Display the message to the user
    }
 
    private static void DataTypeDemo() {
        int myAge = 30;
        String myName = "Rajkumar";
        float mySalary = 1000.50f;
        boolean isAdult = true;
        char initial = 'S';

        System.out.println("My name is " + myName + " and my age is " + myAge);
        System.out.println("My age is " + myAge);
        System.out.println("My salary is " + mySalary);
        System.out.println("I am an adult " + isAdult);
        System.out.println("My initial is " + initial);
    }

    
}
