package com.gla.arrays;
import java.util.Scanner;
public class StoreValue {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Create array of 10 elements and variables
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;

            // b. Infinite loop
            while (true) {
                System.out.print("Enter a positive number (0 or negative to stop): ");
                double value = sc.nextDouble();

                // c. Break if user enters 0 or negative
                if (value <= 0) {
                    break;
                }

                // d. Break if array is full
                if (index == 10) {
                    System.out.println("Array limit reached (10 values).");
                    break;
                }

                // e. Store value in array
                numbers[index] = value;
                index++;
            }

            // f. Calculate total
            for (int i = 0; i < index; i++) {
                total += numbers[i];
            }

            // g. Display values and total
            System.out.println("\n--- Stored Values ---");
            for (int i = 0; i < index; i++) {
                System.out.println("Value " + (i + 1) + " = " + numbers[i]);
            }

            System.out.println("\nTotal of all values = " + total);

            sc.close();
        }
    }