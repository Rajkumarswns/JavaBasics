package org.example.oops;

public class BWPrinter extends Printer  {

    public BWPrinter(String name, String model, float price) {
        super(name, model, price);
    }

    @Override
    public void Print(String Content) {
        System.out.println("Black and White Printing: " + Content);
    }

    @Override
    public void Print(int numebrOfCopies, String Content) {
        for (int i = 0; i < numebrOfCopies; i++) {
            System.out.println("Black and White Printing: " + Content);
        }
    }
    
}
