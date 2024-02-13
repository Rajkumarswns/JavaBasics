package org.example;

import java.util.Calendar;
import java.util.Date;
 
public class OOPSDemo {

    public static void main(String[] args) {

        // Store 1971/02/10 date in the dob variable

        Calendar cal = Calendar.getInstance();
        cal.set(1971, 1, 10);
            Date dob = cal.getTime();

             
            Person rajkmar = new Person("Rajkumar", dob);
            System.out.println("Name: " + rajkmar.getName());
            System.out.println("Age: " + rajkmar.CalculateAge(new Date()));
            System.out.println();


            Benz benz = new Benz();
            benz.start();
            benz.accelerate();
            benz.changeGears(2);
            benz.honk();
            benz.display();
            benz.turn("left");
            benz.decelerate();
            benz.stop();
            System.out.println();
            
    


       
             
           

        
        

    }
    
}
