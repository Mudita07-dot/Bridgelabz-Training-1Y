import java.util.Scanner;

public class MaxOfThreeNumbers {


    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];
        System.out.println("Enter three integers:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }


    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] numbers = takeInput(sc);


        int max = findMaximum(numbers[0], numbers[1], numbers[2]);


        System.out.println("The maximum of the three numbers is: " + max);

        sc.close();
    }
}