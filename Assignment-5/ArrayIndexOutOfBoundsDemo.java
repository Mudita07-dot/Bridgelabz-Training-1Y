import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the exception (without handling)
    public static void generateException(String[] names) {
        System.out.println("Generating exception...");
        // Accessing index larger than array length
        String value = names[names.length]; // invalid index
        System.out.println("Value: " + value);
    }
    public static void handleException(String[] names) {
        System.out.println("Handling exception...");
        try {
            String value = names[names.length];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        handleException(names);

        sc.close();
    }
}