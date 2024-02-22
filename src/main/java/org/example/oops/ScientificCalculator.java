package org.example.oops;

public class ScientificCalculator extends Calculator{
    // Inheritance

    // constructor is a special method which is used to initialize the object

    // default constructor
    public ScientificCalculator() {
        System.out.println("ScientificCalculator constructor");
    }

    // custom constructor

    public ScientificCalculator(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float sin(float a) {
        return (float) Math.sin(a);
    }

    public float cos(float a) {
        return (float) Math.cos(a);
    }

    public float tan(float a) {
        return (float) Math.tan(a);
    }



}
