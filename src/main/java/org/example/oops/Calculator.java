package org.example.oops;

public abstract class Calculator {
        
    public String name;
    public float price;
    private String version = "1.0";

    // Method / functional overloading concepts

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int[] numbers)
    {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
