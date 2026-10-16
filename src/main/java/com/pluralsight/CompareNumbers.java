package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        System.out.print("Pick a number between: ");
        int number = numberInput.nextInt();

        System.out.println(isEven(number));
        System.out.println(isPositive(number));

        numberInput.close();
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isPositive(double number){
        return number % 2 > 0;
    }
}
