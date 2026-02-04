package com.gla.arrays;
import java.util.Scanner;
public class VotingEligibility {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Define an array of 10 integer elements
            int[] ages = new int[10];

            // Take user input for ages
            System.out.println("Enter the ages of 10 students:");
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Age of student " + (i + 1) + ": ");
                ages[i] = sc.nextInt();
            }

            // b. Loop through the array using length property
            System.out.println("\n--- Voting Eligibility Report ---");
            for (int i = 0; i < ages.length; i++) {
                int age = ages[i];

                if (age < 0) {
                    System.out.println("Student " + (i + 1) + " → Invalid age (" + age + ")");
                } else if (age >= 18) {
                    System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
                } else {
                    System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
                }
            }

            sc.close();
        }
    }

