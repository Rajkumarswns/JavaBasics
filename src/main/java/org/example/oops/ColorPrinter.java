package org.example.oops;

public class ColorPrinter extends Printer {

    public ColorPrinter(String name, String model, float price) {
        super(name, model, price);
    }
    
        @Override
        public void Print(String Content) {
            System.out.println("Color Printing: " + Content);
        }

        @Override
        public void Print(int numebrOfCopies, String Content) {
            for (int i = 0; i < numebrOfCopies; i++) {
                System.out.println("Color Printing: " + Content);
            }
        }
    
}
