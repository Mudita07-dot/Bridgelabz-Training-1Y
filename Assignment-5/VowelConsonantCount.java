import java.util.*;

public class VowelConsonantCount {

    public static void countVC(String text) {
        int vowels = 0, consonants = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        countVC(sc.nextLine());
    }
}