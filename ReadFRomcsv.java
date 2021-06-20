package com.learn.javacourse;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.HashMap;

public class ReadFRomcsv {

    public static void main(String[] args) {

        BufferedReader br = null;
        String str =  null;
        String header[] = null;
        String colVal[] = null;
        int rowCounter = 0;
        int count = 0;
        HashMap<String,String>  test = null;

        try {
            br = new BufferedReader(new FileReader("/home/costrategix/Downloads/10000Records.csv"));

            while ((str = br.readLine())!= null) {

                System.out.println("Before spilitting ->" + str);
                if (rowCounter == 0) {
                    header = str.split(",");

                } else {
                    colVal = str.split(",");
                }

                rowCounter++;
            }
            test  = new HashMap<String,String>();
            while (count < header.length) {

                test.put(header[count], colVal[count]);
                count++;

            }
            for(String s: test.keySet()){

                System.out.println("REtrieved value from csv");

                System.out.println("header name "+ s + "colValue->" +test.get(s));

            }




        } catch (Exception  e) {
            e.printStackTrace();
        }


    }
}
