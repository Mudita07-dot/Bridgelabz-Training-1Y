import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String input) {
        System.out.println("Generating exception...");

        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String input) {
        System.out.println("Handling exception...");
        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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