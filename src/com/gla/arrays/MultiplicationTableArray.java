package com.gla.arrays;
import java.util.Scanner;
public class MultiplicationTableArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Get integer input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Define an integer array to store results (1 to 10)
            int[] table = new int[10];

            // b. Run loop from 1 to 10 and store results
            for (int i = 1; i <= 10; i++) {
                table[i - 1] = number * i;
            }

            // c. Display results
            System.out.println("\n--- Multiplication Table of " + number + " ---");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + table[i - 1]);
            }

            sc.close();
        }
    }

