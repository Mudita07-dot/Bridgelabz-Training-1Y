package com.gla.arrays;
import java.util.Scanner;
public class FactorsArrays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // a. Take input for a number
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            // b. Initialize maxFactor and factors array
            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            int index = 0;

            // c. Find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    // If array is full, resize
                    if (index == maxFactor) {
                        maxFactor *= 2; // double the size
                        int[] temp = new int[maxFactor];
                        // copy old elements
                        for (int j = 0; j < factors.length; j++) {
                            temp[j] = factors[j];
                        }
                        factors = temp;
                    }
                    // store factor
                    factors[index] = i;
                    index++;
                }
            }

            // e. Display the factors
            System.out.println("\n--- Factors of " + number + " ---");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
    }
}
