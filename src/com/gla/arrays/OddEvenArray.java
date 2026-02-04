package com.gla.arrays;
import java.util.Scanner;
public class OddEvenArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // a. Get input from user
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please enter a natural number (positive integer).");
                return; // exit program
            }

            // b. Create arrays for odd and even numbers
            int size = number / 2 + 1; // maximum possible size
            int[] odd = new int[size];
            int[] even = new int[size];

            // c. Index variables
            int oddIndex = 0;
            int evenIndex = 0;

            // d. Loop through numbers from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }

            // e. Print odd and even arrays
            System.out.println("\n--- Odd Numbers ---");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }

            System.out.println("\n\n--- Even Numbers ---");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
        }
    }
