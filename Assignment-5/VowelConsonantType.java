import java.util.*;

public class VowelConsonantType {

    public static void displayType(String text) {
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if ("aeiou".indexOf(lower) != -1)
                    System.out.println(ch + " -> Vowel");
                else
                    System.out.println(ch + " -> Consonant");
            } else {
                System.out.println(ch + " -> Not Letter");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        displayType(sc.nextLine());
    }
}