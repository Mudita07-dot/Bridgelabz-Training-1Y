package Arrays;
import java.util.Scanner;
public class LargestDigitDynamic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int maxDigit = 10; // initial size
            int[] digits = new int[maxDigit];
            int index = 0;

            // Extract digits with dynamic expansion
            while (number != 0) {
                if (index == maxDigit) {
                    // Expand array size by 10
                    maxDigit += 10;
                    int[] temp = new int[maxDigit];
                    // Copy old digits
                    for (int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }
                    digits = temp;
                }

                int digit = number % 10; // get last digit
                digits[index] = digit;
                index++;
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

