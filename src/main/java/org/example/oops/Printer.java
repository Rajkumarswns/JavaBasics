package org.example.oops;

public abstract class Printer implements IPrint {

    private String _name;
    private String _model;
    private float _price;

    public Printer(){}

    public Printer(String name, String model, float price) {
        _name = name;
        _model = model;
        _price = price;
    }

    public String getName() {
        return _name;
    }

    public String getModel() {
        return _model;
    }

    public float getPrice() {
        return _price;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setModel(String model) {
        _model = model;
    }

    public void setPrice(float price) {
        _price = price;
    }

    abstract public void Print(String Content);
    abstract public void Print(int numebrOfCopies, String Content);

    // @Override
    // public void Print(String Content) {
    //     System.out.println("Generic Printing: " + Content);
    // }

    // @Override
    // public void Print(int numebrOfCopies, String Content) {
    //     for (int i = 0; i < numebrOfCopies; i++) {
    //         System.out.println("Generic Printing: " + Content);
    //     }
    // }

     

    
    
}
