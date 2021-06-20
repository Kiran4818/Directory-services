package com.learn.javacourse;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class TestPhone {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Map phonebook = new TreeMap();

        String name;
        String ph;

        int ch1 = 0;
        while (ch1 != 4) {

            System.out.println("Enter 1 person to add name with phone num");
            System.out.println("Enter 2 to list all person with phone num");
            System.out.println("Enter 3 search for phone num");
            System.out.println("Enter 4 to exit");

            while (!sc1.hasNextInt()) {

                System.out.println("PLease enter int values only");
                sc1.next();
            }

            ch1 = sc1.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("case 1 entered");

                    System.out.println("enter the name of the person");
                    name = sc1.next();
                    System.out.println("enter phone num of the person" + name);

                    ph = sc1.next();
                    phonebook.put(name, ph);
                    break;

                case 2:
                    System.out.println("phone entered");

                    System.out.println(phonebook);
                    break;

                case 3:
                    System.out.println("case 3 entered");

                    System.out.println("enter name of the person to search");
                    name = sc1.next();

                    if (phonebook.get(name) != null)
                        System.out.println("phone num of " + name + " is " + phonebook.get(name));
                        else{


                            System.out.println("name / num does not exist in contact");
                            break;

                        }
                            case 4:
                                System.out.println("..........");
                                break;

                            default :
                                System.out.println("enter value with 1 to 4 only");
                                break;

                        }

                    }


            }

        }


