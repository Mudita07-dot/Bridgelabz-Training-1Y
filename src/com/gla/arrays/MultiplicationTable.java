package com.gla.arrays;
import java.util.Scanner;
public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take integer input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Define array to store multiplication results (for 6 to 9 → 4 results)
            int[] multiplicationResult = new int[4];

            // b. Using a for loop, calculate multiplication table from 6 to 9
            int index = 0;
            for (int i = 6; i <= 9; i++) {
                multiplicationResult[index] = number * i;
                index++;
            }

            // c. Display results
            System.out.println("\n--- Multiplication Table of " + number + " (from 6 to 9) ---");
            index = 0;
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
                index++;
            }

            sc.close();
        }
    }

