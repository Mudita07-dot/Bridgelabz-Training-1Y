import java.util.Scanner;

public class VowelConsonantCounter2 {


    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    public static int[] countVowelsAndConsonants(String str) {
        str = str.toLowerCase(); // normalize case
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // only consider alphabetic characters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void displayResults(String str, int vowels, int consonants) {
        System.out.println("In the string: \"" + str + "\"");
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);

        int[] result = countVowelsAndConsonants(input);
        
        displayResults(input, result[0], result[1]);

        sc.close();
    }
}