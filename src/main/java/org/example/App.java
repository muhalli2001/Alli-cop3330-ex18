package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //C = (F − 32) × 5 / 9
        //F = (C × 9 / 5) + 32
        float F_=0, C_=0;
        Scanner temp = new Scanner(System.in);
        System.out.println("Press C for celsius, F for farenheit");
        String t = temp.nextLine();
        System.out.println("your choice: "+t);
        //F -> C
        if((t).equals("C")||(t).equals("c")){
            Scanner i = new Scanner(System.in);
            System.out.println("Please provide the temperature in Celsius");
            float F = i.nextFloat();

            C_ = (F-32)*5/9;
            System.out.println("The temperature in Celsius is: "+C_);
        }

        //C -> F
        if((t).equals("F")||(t).equals("f")){
            Scanner o = new Scanner(System.in);
            System.out.println("Please provide the temperature in Celsius");
            float C = o.nextFloat();

            F_ = (C*9/5)+32;
            System.out.println("The temperature in farenheit is: "+F_);
        }

    }
}
