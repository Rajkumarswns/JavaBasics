package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

// Below class do not have any properties  but it has list of actions i.e methods
//  Class helps to represent the real world entity, it can have property and methodsd
//  it can decide what to expose to the outside world by way of
    //  scope of the property and methods 
        // private - purely internal to the class not available outside
        // in order to store the value in private variable we use getter/setter
        // getter/setter helps to implement business logic / rules example Age > 18




public class JavaSession2 {

    public static void main(String[] args) {
        System.out.println("Hello World");


        StringMgmt();
        TwoDimensionalArrayDemo();
        DateDemo();
        FileIODemo(); // File, FileInputStream (write), FileOutputStream(read)
        // Represent real world entity as a class, property and method
        // Representing Animal, Employee, 
        // private member, getter, setter 
 

        // Proper Class implementation tehn relate it with realworld class in selenium
        // interface
        // abstract class
        // inheritance
        // webdriver 


        // File IO Demo

        

    }

    private static void FileIODemo()
    {
        File file = new File("C:\\Users\\Rajkumar\\Desktop\\JavaSession2.java");
        System.out.println(null + "File Exists: " + file.exists());
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());

        // write into file
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("Hello World".getBytes());
            fos.close();
        } catch (Exception e) {
            // handle the exception
            System.out.println(null + "Exception: " + e.getMessage());

            
        }

        // Demo of reading file using input stream
        try {
            FileInputStream fis = new FileInputStream(file);
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception ex) {
            // handle the exception
            System.out.println(null + "Exception: " + ex.getMessage());
         }
    }

    private static void DateDemo() {
        // GEt curretn date
        Calendar today = Calendar.getInstance();
        System.out.println("Today's Date: " + today.getTime());

        // Display the date in the format of dd/mm/yyyy
        System.out.println("Today's Date: " + today.get(Calendar.DATE) + "/" +
                (today.get(Calendar.MONTH) + 1) + "/" + today.get(Calendar.YEAR));

        // Date Data Type Demo
        Calendar cal = Calendar.getInstance();
        cal.set(1971, 1, 10);

        // Get day Monday/Tuesday etc
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        // Get month
        System.out.println(cal.get(Calendar.MONTH));
        // Get year
        System.out.println(cal.get(Calendar.YEAR));

        // measure age in years
        int age = today.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        System.out.println("My Age is :" + age);
    }

    private static void TwoDimensionalArrayDemo() {
        // Creating array to hold list of 5 names
        // one diemensional array
        String[] names = new String[3];
        names[0] = "Rajkumar";
        names[1] = "Vivek";
        names[2] = "Rajesh";

        // Create an array to store 5 studetns with 3 marks
        // two dimensional array
        int[][] marks = new int[3][3]; // 9 elements
        marks[0][0] = 90;
        marks[0][1] = 80;
        marks[0][2] = 70;

        marks[1][0] = 91;
        marks[1][1] = 81;
        marks[1][2] = 71;

        marks[2][0] = 92;
        marks[2][1] = 82;
        marks[2][2] = 72;

        // Display the details form marks array
        for (int i = 0; i < 3; i++) // Rows
        {
            System.out.println("Student " + i + " Marks: " + marks[i][0] + " "
                    + marks[i][1] + " " +
                    marks[i][2]);
        }
    }

    private static void StringMgmt() {
        // String manipulation
        String myString = "Hello Rajkumar Welcome to the Java 2 Session";
        // Display length of the string
        System.out.println("Length of the string: " + myString.length());
        // display upper case of the string
        System.out.println("Upper case of the string: " + myString.toUpperCase());
        // display lower case of the string
        System.out.println("Lower case of the string: " + myString.toLowerCase());
        // Extract the portion of the string
        System.out.println("Extract the portion of the string: " +
                myString.substring(6, 15));
        // From 8th character onwards get the rest of the string
        System.out.println("From 8th character onwards get the rest of the string: " +
                myString.substring(8));
        // Replace the portion of the string
        System.out.println("Replace the portion of the string: " +
                myString.replace("Rajkumar", "Vivek"));
        // GEt the index of the character "R"
        System.out.println("Index of the character 'R': " + myString.indexOf("R"));

        // String comparison
        String str1 = "Hello";
        String str2 = "Hello";
        if (str1.equals(str2)) // str1 == str2
        {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
