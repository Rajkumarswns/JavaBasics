package org.example.oops;
public abstract class Car implements IVehicle {
    public void start() {
        System.out.println("Car Starting");
    }
    public void stop() {
        System.out.println("Car Stopping");
    }
    public void accelerate() {
        System.out.println("Car Accelerating");
    }
    public void decelerate() {
        System.out.println("Car Decelerating");
    }
    public void turn(String direction) {
        System.out.println("Car Turning " + direction);
    }

    // add a override method for changeGears
    public abstract void changeGears(int gear);
   
    public void honk() {
        System.out.println("Car Honking");
    }
    public void display() {
        System.out.println("Car Displaying");
    }
}