package com.gla.arrays;
import java.util.Scanner;
public class StudentGrades2D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take input for number of students
            System.out.print("Enter number of students: ");
            int number = sc.nextInt();

            // b. Create 2D array for marks, and arrays for percentage & grade
            int[][] marks = new int[number][3];   // [physics, chemistry, maths]
            double[] percentage = new double[number];
            String[] grade = new String[number];

            // c. Input marks for each student
            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1) + ":");

                for (int j = 0; j < 3; j++) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print(subject + ": ");
                    int mark = sc.nextInt();

                    // If marks are negative, ask again (decrement j to retry same subject)
                    if (mark < 0) {
                        System.out.println("Marks cannot be negative. Please re-enter.");
                        j--;
                        continue;
                    }
                    marks[i][j] = mark;
                }

                // d. Calculate percentage
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                percentage[i] = total / 3.0;

                // Assign grade based on percentage
                if (percentage[i] >= 90) {
                    grade[i] = "A";
                } else if (percentage[i] >= 75) {
                    grade[i] = "B";
                } else if (percentage[i] >= 50) {
                    grade[i] = "C";
                } else {
                    grade[i] = "D";
                }
            }

            // e. Display results
            System.out.println("\n--- Student Report ---");
            for (int i = 0; i < number; i++) {
                System.out.printf("Student %d -> Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %s%n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }

            sc.close();
        }
    }
