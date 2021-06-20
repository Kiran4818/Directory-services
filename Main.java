package com.learn.javacourse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args)  throws  Exception{

        HashMap<String,Integer> hm = new HashMap<>();





        FileReader fr =
                new FileReader("/home/costrategix/Downloads/10000Records.csv");

        int i;
        while ((i=fr.read()) != -1)
            System.out.print((char) i);


        Employee e = new Employee();
        System.out.println("employee firstname =" +e.getFirstname());
        System.out.println("emploee lastname =" +e.getLastname() );

     //   Employee1 e1 = new Employee1();


       // System.out.print("employee lastName = " + e.getLastname());
      //  Employee1 e1 = new Employee1(String city, int dob);
      //  e1.getCity();
       // e1.getDob();


       // System.out.println();


        //processing.core.Applet
    }
}

