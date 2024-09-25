package org.example.External;

import java.util.Scanner;

public class Main {

     
    public static void main(String[] args) {

        // Simple display message
        System.out.println("Hello world!");

        System.out.println("https://pac.zscalerthree.net/BcpmC4KC9Njv/kiosk.pac");

        
        // DataTypeDemo
        DataTypeDemo();

        // Get input from the user
        UserInputDemo();

        functiondemo();
        // Demo optional parameter
        // Create a function called DoMath with two number and one optional parameter

        // demo of relational operators
        RelationLogicalOpsDemo();

        // Array demo
        ArrayDemo();

        stringMgmtDemo();

        ifDemo();

        forEachMethod();

        LoopDemo();

        FileIOMethod();

        PropertyFileDemo();

        HashmapDemo();

        // wait for the user to hit enter
        System.out.println("Press enter to continue...");

    }

    private static void DataTypeDemo() {

        // create various data type variables
        int myNum = 5; // Integer (whole number)
        float myFloatNum = 5.99f; // Floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean
        String myText = "Hello"; // String
        boolean isMale  = true;

        // what is the scope of mynum variable
      
        
        // print the variables
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);



      }

    private static void HashmapDemo() {
        
        // demo of hashmap
        java.util.HashMap<String, Integer> people = new java.util.HashMap<String, Integer>();
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        people.put("Paul", 40);
        for (java.util.Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
        }

    }

    private static void functiondemo() {
        // Get Number 1 from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");

        int num1 = scanner.nextInt();
        // Get Number 2 from the user
        System.out.println("Enter a number 2: ");

        int num2 = scanner.nextInt();
        // Add the two numbers together and display the result
        PerformCalculation(num1, num2, "+");
        PerformCalculation(num1, num2, "-");
        PerformCalculation(num1, num2, "*");
        PerformCalculation(num1, num2, "/");

        scanner.close(); // Close the scanner
    }

    private static void RelationLogicalOpsDemo() {
        int a = 10;
        int b = 20;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        // demo of logical operators

        // demo of logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("x ! y" + (!y));
    }

    private static void ArrayDemo() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("The third element in the array is: " + numbers[2]);
        // find the biggest number
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The biggest number in the array is: " + max);

        // demo of string array
        String[] names = { "John", "Paul", "George", "Ringo" };
        for (int i = 0; i < names.length; i++) {
            System.out.println("The name at index " + i + " is: " + names[i]);
        }

        // /store five students name and two subjects marks in an array
        String[] students = { "John", "Paul", "George", "Ringo", "Pete" };
        int[][] marks = { { 90, 80 }, { 85, 90 }, { 88, 85 }, { 80, 80 }, { 70, 60 } };
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " scored " + marks[i][0] + " in Math and " + marks[i][1] + " in Science");
        }
    }

    private static void stringMgmtDemo() {
        // demo of extract part of string
        String str = "Hello, World!";
        System.out.println(str.substring(7, 12));

        // demo of string comparison
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

        // demo of string concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // demo of upper case lower case
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }

    private static void ifDemo() {
        // demo of if else
        int n = 10;
        if (n > 0) {
            System.out.println("The number is positive");
        } else if (n < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }

    private static void forEachMethod() {
        // demo of for each class
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String car : cars) {
            System.out.println(car);
        }

        // itereate cars array using lambda
        java.util.Arrays.stream(cars).forEach(car -> System.out.println(car));

        // itereate cars array using lambda with multiple statements
        java.util.Arrays.stream(cars).forEach(car -> {
            System.out.println(car);
            System.out.println("This is a car");
        });
    }

    private static void LoopDemo() {
         // demo using while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // demo using do while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // for loop demo
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }
    }

    private static void FileIOMethod() {
        // File IO demo
        java.io.File file = new java.io.File("test.txt");
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file);
            writer.write("Hello, World!");
            writer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // read file
        try {
            java.io.FileReader reader = new java.io.FileReader(file);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void PropertyFileDemo() {
        // Properties file creation
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty("name", "John Doe");
        properties.setProperty("email", "rajkmar.s@wns.com");
        try {
            properties.store(new java.io.FileWriter("config.properties"), "Config file");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Properties file reading
        java.util.Properties properties1 = new java.util.Properties();
        try {
            properties1.load(new java.io.FileReader("config.properties"));
            System.out.println(properties1.getProperty("name"));
            System.out.println(properties1.getProperty("email"));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private static void PerformCalculation(int num1, int num2, String operation) {

        switch (operation) {
            case "+":
                int sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case "-":
                int difference = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
                break;
            case "*":
                int product = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
                break;
            case "/":
                int quotient = num1 / num2;
                System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
                break;
            default:
                System.out.println("Invalid operation");
        }

    }

    private static void UserInputDemo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        // Get two numbers from the user
        System.out.println("Enter a number: ");

        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        // Add the two numbers together and display the result
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}