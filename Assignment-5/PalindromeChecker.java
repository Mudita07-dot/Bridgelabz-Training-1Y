import java.util.Scanner;

public class PalindromeChecker {

    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        return sc.nextLine();
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = takeInput(sc);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        sc.close();
    }
}