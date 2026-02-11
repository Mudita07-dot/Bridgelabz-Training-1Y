import java.util.Scanner;

public class FibonacciGenerator {
    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        if (terms > 0) {
            generateFibonacci(terms);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}