package org.example;

import java.util.Calendar;

public class Person {


    private String _name;
    private java.util.Date _dob;
    // add constructor
    public Person() {
        System.out.println("PersonClass Constructor");
    }

    // add custom constructor
    public Person(String name) {
        _name = name;
        System.out.println("PersonClass Constructor with name: " + name);
    }

    // add custom constructor
    public Person(String name, java.util.Date date) {
        _name = name;
        _dob = date;
        System.out.println("PersonClass Constructor with name: " + name + " and dob: " + date);
    }

    // add getter and setter for _name
    public String getName() {
        return _name;
    }

    public int CalculateAge(java.util.Date today)
    {



        Calendar cal = Calendar.getInstance();
        cal.setTime(_dob);
        int birthyear = cal.get(Calendar.YEAR);

        cal.setTime(today);
        int currentYear = cal.get(Calendar.YEAR);
        return currentYear - birthyear;

    }




  
}
