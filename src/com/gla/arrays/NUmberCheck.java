package com.gla.arrays;
import java.util.Scanner;
public class NUmberCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Define an integer array of 5 elements
            int[] numbers = new int[5];

            // Get user input
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            // b. Loop through the array
            System.out.println("\n--- Number Analysis ---");
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
                System.out.print("Number " + (i + 1) + " = " + num + " → ");

                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.println("Positive Even");
                    } else {
                        System.out.println("Positive Odd");
                    }
                } else if (num < 0) {
                    System.out.println("Negative");
                } else {
                    System.out.println("Zero");
                }
            }

            // d. Compare first and last element
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            System.out.println("\n--- Comparison of First and Last Elements ---");
            if (first == last) {
                System.out.println("First element (" + first + ") is equal to last element (" + last + ")");
            } else if (first > last) {
                System.out.println("First element (" + first + ") is greater than last element (" + last + ")");
            } else {
                System.out.println("First element (" + first + ") is less than last element (" + last + ")");
            }

            sc.close();
        }
    }

