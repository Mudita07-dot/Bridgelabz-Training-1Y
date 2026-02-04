package com.gla.arrays;
import java.util.Scanner;
public class DigitFrequency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take input for a number
            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            // b. Find the count of digits in the number
            String numStr = Long.toString(Math.abs(number)); // handle negative input
            int count = numStr.length();

            // c. Save digits in an array
            int[] digits = new int[count];
            for (int i = 0; i < count; i++) {
                digits[i] = numStr.charAt(i) - '0'; // convert char to int
            }

            // d. Frequency array of size 10
            int[] frequency = new int[10];
            for (int digit : digits) {
                frequency[digit]++;
            }

            // e. Display frequency of each digit
            System.out.println("\n--- Digit Frequency ---");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
                }
            }

            sc.close();
        }
    }