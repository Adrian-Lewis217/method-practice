package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        System.out.print("Pick a number: ");
        int number = numberInput.nextInt();

        System.out.println(isEven(number));
        System.out.println(isPositive(number));
        System.out.println();

        numberInput.close();

        System.out.println("===Are These Numbers True or False===");
        System.out.println(isEven(5));     // false
        System.out.println(isEven(10));    // true
        System.out.println(isPositive(-3.5));  // false
        System.out.println(isPositive(7.2));   // true
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isPositive(double number){
        return number > 0;
    }
}
