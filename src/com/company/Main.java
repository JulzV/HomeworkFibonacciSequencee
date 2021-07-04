package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

// Assignment
// Write a program that takes a value from the user and
// prints out that number's position in fibonacci sequence.
// Fibonacci sequence is a series of numbers where the previous two numbers sum up
// to make the next number.
// In this case, take the first two numbers of the sequence to be 1, 1
// e.g. 1, 1, 2, 3, 5, 8, ...
// Enter the position you want: 4
// 3

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int defaultValue1 = 0;
            int defaultValue2 = 1;
            int nextValue = 1;

            System.out.println("Enter number position you want to find in Fibonacci number row: ");
            int userNumber = scanner.nextInt();

            // Defining Fibonaacci formula
            for (int i = 1; i <= userNumber - 1; i++) {
                nextValue = defaultValue1 + defaultValue2;
                defaultValue1 = defaultValue2;
                defaultValue2 = nextValue;
            }
            System.out.println("The value in Fibonacci number row is: " + nextValue);

        }
    }
}