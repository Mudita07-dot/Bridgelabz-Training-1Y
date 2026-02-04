package com.gla.arrays;
import java.util.Scanner;
public class BMIProgram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take input for number of persons
            System.out.print("Enter number of persons: ");
            int number = sc.nextInt();

            // b. Create multi-dimensional array and weight status array
            double[][] personData = new double[number][3]; // [height, weight, BMI]
            String[] weightStatus = new String[number];

            // c. Take input for weight and height
            for (int i = 0; i < number; i++) {
                double height, weight;

                // Input height with validation
                do {
                    System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                    height = sc.nextDouble();
                    if (height <= 0) {
                        System.out.println("Height must be positive. Try again.");
                    }
                } while (height <= 0);

                // Input weight with validation
                do {
                    System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                    weight = sc.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Weight must be positive. Try again.");
                    }
                } while (weight <= 0);

                // Store height and weight
                personData[i][0] = height;
                personData[i][1] = weight;

                // d. Calculate BMI
                double bmi = weight / (height * height);
                personData[i][2] = bmi;

                // Determine weight status
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 24.9) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 29.9) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            // e. Display results
            System.out.println("\n--- Person Data ---");
            for (int i = 0; i < number; i++) {
                System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                        (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
            }

            sc.close();
        }
    }
