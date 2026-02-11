import java.util.Scanner;

public class GCDLCMCalculator {

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[2];
        System.out.print("Enter the first number: ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter the second number: ");
        numbers[1] = sc.nextInt();
        return numbers;
    }
    public static void displayResults(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = takeInput(sc);
        int gcd = calculateGCD(numbers[0], numbers[1]);
        int lcm = calculateLCM(numbers[0], numbers[1]);
        displayResults(numbers[0], numbers[1], gcd, lcm);

        sc.close();
    }
}