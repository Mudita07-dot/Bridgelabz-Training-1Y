import java.util.*;

public class UniqueCharacters {

    public static char[] uniqueChars(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (result.toString().indexOf(ch) == -1)
                result.append(ch);
        }
        return result.toString().toCharArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        char[] unique = uniqueChars(sc.nextLine());
        System.out.println("Unique Characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}