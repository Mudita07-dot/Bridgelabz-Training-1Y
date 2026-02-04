package com.gla.arrays;
import java.util.Scanner;
public class MeanHeight {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // b. Create a double array of size 11
            double[] heights = new double[11];

            // Input values from the user
            System.out.println("Enter the heights of 11 football players (in cm or meters):");
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Height of player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
            }

            // c. Find the sum of all elements
            double sum = 0;
            for (int i = 0; i < heights.length; i++) {
                sum += heights[i];
            }

            // d. Calculate mean
            double mean = sum / heights.length;

            // Display result
            System.out.println("\n--- Result ---");
            System.out.printf("Mean height of players = %.2f%n", mean);

            sc.close();
        }
    }


