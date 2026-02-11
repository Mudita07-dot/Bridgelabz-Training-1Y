import java.util.Scanner;

public class ReverseString {


    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void displayResult(String original, String reversed) {
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        String reversed = reverseString(input);
        displayResult(input, reversed);

        sc.close();
    }
}