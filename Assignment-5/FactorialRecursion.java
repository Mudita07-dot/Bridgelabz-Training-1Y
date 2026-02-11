import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive case
    }
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a non-negative integer: ");
        return sc.nextInt();
    }

    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = takeInput(sc);
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }

        sc.close();
    }
}