package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main(String[] args)
    {
        String buf;
        int item1count;
        int item2count;
        int item3count;
        double item1price;
        double item2price;
        double item3price;
        double subtotal;
        double tax;
        double total;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        buf = sc.nextLine();
        item1price = Double.valueOf(buf);
        System.out.print("Enter the quantity of item 1: ");
        buf = sc.nextLine();
        item1count = Integer.valueOf(buf);

        System.out.print("Enter the price of item 2: ");
        buf = sc.nextLine();
        item2price = Double.parseDouble(buf);
        System.out.print("Enter the quantity of item 2: ");
        buf = sc.nextLine();
        item2count = Integer.parseInt(buf);

        System.out.print("Enter the price of item 3: ");
        buf = sc.nextLine();
        item3price = Double.parseDouble(buf);
        System.out.print("Enter the quantity of item 3: ");
        buf = sc.nextLine();
        item3count = Integer.parseInt(buf);

        subtotal = (item1count * item1price) + (item2count * item2price) + (item3count * item3price);
        tax = subtotal * 0.055;
        total = subtotal + tax;
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
