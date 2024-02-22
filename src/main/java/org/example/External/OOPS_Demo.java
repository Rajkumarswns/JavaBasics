package org.example.External;

import org.example.oops.BWPrinter;
import org.example.oops.ColorPrinter;
import org.example.oops.Printer;

public class OOPS_Demo {

   public static void main(String[] args) {
      System.out.println("Hello, World!");

      // Printer p1 = new Printer();  
      // p1.setName("Compaq");
      // p1.setModel("IJ 650");
      // p1.setPrice(2000.0f);

      // displayPrinterDetails(p1);


      // Printer p2 = new Printer("HP", "LaserJet", 10000.0f); 
      // System.out.println(p1.getName());
      // System.out.println(p1.getModel());
      // System.out.println(p1.getPrice());

      //  displayPrinterDetails(p2);
        

        // With extend and implementation
        Printer hpPrinter = new BWPrinter("HP", "LaserJet", 10000.0f);
        hpPrinter.Print("Hello World");
        hpPrinter.Print(5, "Hello World");

        displayPrinterDetails(hpPrinter);

        Printer hpColorPrinter = new ColorPrinter("Compac", "IJ 650", 2000.0f);
        hpColorPrinter.Print("Hello World");
        hpColorPrinter.Print(5, "Hello World");
        
        displayPrinterDetails(hpColorPrinter);

         
       
   }

    public static void displayPrinterDetails(Printer p) {
        System.out.println("Name: " + p.getName());
        System.out.println("Model: " + p.getModel());
        System.out.println("Price: " + p.getPrice());
    }
    
}
