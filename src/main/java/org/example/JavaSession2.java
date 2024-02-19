package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class JavaSession2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        StringManagement();
        FileManagement();
        HashMapDemo();
        PropertyFileDemo();
        DateDemo();

        
    }

    private static void DateDemo() {
         Calendar   cal = Calendar.getInstance();
        cal.set(1971, 1, 10);
        // Get day Monday/Tuesday etc
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
          // Get month
        System.out.println(cal.get(Calendar.MONTH));
        // Get year
        System.out.println(cal.get(Calendar.YEAR));

        // GEt curretn date
        Calendar today = Calendar.getInstance();
        // measure age in years
        int age = today.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
        System.out.println("My Age is :" + age);
         
                


      }

    private static void PropertyFileDemo() {

        
        // Demo of Property file
        // Properties file is used to store configuration data
        // It is a key value pair
        // Create property file
        var prop = new Properties();
        prop.put("url", "http://www.example.com");
        prop.put("username", "admin");
        prop.put("password", "admin123");

        //write to file
        try {
            prop.store(new FileOutputStream("config.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read property file
        try {
            prop.load(new FileInputStream("config.properties"));
            System.out.println(prop.getProperty("url"));
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
       
      }

    private static void HashMapDemo() {

        // Demo of HashMap
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "John");
        map.put("age", "25");
        map.put("city", "New York");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("city"));

        // Iterating over the map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


      }

    private static void FileManagement() {
        // TODO Auto-generated method stub
// Demo of writing reading file using input/output stream
File file = new File("test.txt");
System.out.println(file.exists());
System.out.println(file.getAbsolutePath());
System.out.println(file.isFile());
System.out.println(file.isDirectory());

// write into file
try {
    FileOutputStream fos = new FileOutputStream(file);
    fos.write("Hello World".getBytes());
    fos.close();
} catch (Exception e) {
    e.printStackTrace();
}

    // Demo of reading file using input stream
    try {
        FileInputStream fis = new FileInputStream(file);
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    // Demo of writing file using output stream

    }

    private static void StringManagement() {
        // String manipulation demo
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("o", 5)); // Search for "o" starting from index 5
        System.out.println(str.indexOf("o", 6)); // Search for "o" starting from index 6
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.replace(" ", "_"));
        System.out.println(str.substring(0, 5)); // Substring from index 0 to 5
        System.out.println(str.substring(6)); // Substring from index 6 to end
    }
}
