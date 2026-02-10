import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String input) {

        System.out.println("Generating exception...");
        String result = input.substring(5, 2);
        System.out.println("Result: " + result); // This line will never execute
    }
    public static void handleException(String input) {
        System.out.println("Handling exception...");
        try {
            String result = input.substring(5, 2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        handleException(userInput);

        sc.close();
    }
}