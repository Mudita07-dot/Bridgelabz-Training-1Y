import java.util.Scanner;

public class RemoveDuplicatesString {

    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    public static String removeDuplicates(String str) {
        boolean[] seen = new boolean[256]; // ASCII character set
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
    public static void displayResult(String original, String modified) {
        System.out.println("Original string: " + original);
        System.out.println("String after removing duplicates: " + modified);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);

        String modified = removeDuplicates(input);
        displayResult(input, modified);

        sc.close();
    }
}