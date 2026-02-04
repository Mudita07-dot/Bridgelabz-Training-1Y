package com.gla.arrays;
import java.util.Scanner;
public class MatrixToArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // a. Take user input for rows and columns
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            // Create 2D array (matrix)
            int[][] matrix = new int[rows][cols];

            // Take user input for matrix elements
            System.out.println("\nEnter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // b. Create 1D array of size rows*columns
            int[] array = new int[rows * cols];

            // c. Copy elements from 2D to 1D using nested loops
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }

            // d. Display the 2D matrix
            System.out.println("\n--- 2D Matrix ---");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Display the 1D array
            System.out.println("\n--- 1D Array ---");
            for (int i = 0; i < array.length; i++) {
                System.out.println("Position " + i + " = " + array[i]);
            }

        }
    }


