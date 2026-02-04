package Arrays;
import java.util.Scanner;
public class FriendsComparison {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];

            // Input loop
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter age of " + names[i] + ": ");
                ages[i] = sc.nextInt();

                System.out.println("Enter height of " + names[i] + " (in cm): ");
                heights[i] = sc.nextDouble();

                // Validation
                if (ages[i] <= 0 || heights[i] <= 0) {
                    System.out.println("Invalid input! Please re-enter.");
                    i--; // retry for same friend
                }
            }

            // Find youngest
            int minAgeIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (ages[i] < ages[minAgeIndex]) {
                    minAgeIndex = i;
                }
            }

            // Find tallest
            int maxHeightIndex = 0;
            for (int i = 1; i < 3; i++) {
                if (heights[i] > heights[maxHeightIndex]) {
                    maxHeightIndex = i;
                }
            }

            // Output
            System.out.println("\n--- Results ---");
            System.out.println("Youngest friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
            System.out.println("Tallest friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

            sc.close();
        }
    }


