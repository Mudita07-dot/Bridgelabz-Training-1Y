package com.gla.arrays;
import java.util.Scanner;
public class FizzBuzzArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input for a number
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // a. Create a String array to save results
            String[] results = new String[number + 1]; // include 0 to number

            // Loop from 0 to number
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0 && i != 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0 && i != 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // b. Display results with index positions
            System.out.println("\n--- FizzBuzz Results ---");
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }
    }

