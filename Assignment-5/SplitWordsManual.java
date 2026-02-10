import java.util.*;

public class SplitWordsManual {

    public static String[] splitWords(String text) {
        return text.trim().split(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] user = splitWords(text);
        String[] builtIn = text.split(" ");
        System.out.println("Arrays equal: " + Arrays.equals(user, builtIn));
    }
}