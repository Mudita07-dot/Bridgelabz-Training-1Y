package Arrays;
import java.util.Scanner;
public class LargestsDigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int maxDigit = 10; // maximum digits to store
            int[] digits = new int[maxDigit];
            int index = 0;

            // Extract digits
            while (number != 0) {
                int digit = number % 10; // get last digit
                digits[index] = digit;
                index++;

                if (index == maxDigit) {
                    break; // stop if array is full
                }

                number /= 10; // remove last digit
            }

            // Initialize largest and second largest
            int largest = 0;
            int secondLargest = 0;

            // Find largest and second largest
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }

            // Output
            System.out.println("\n--- Results ---");
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);

        }


}
