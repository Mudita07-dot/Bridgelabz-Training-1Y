import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);

        sc.close();
    }
    public static String findLongestWord(String sentence) {
        // Split sentence into words using spaces and punctuation
        String[] words = sentence.split("[\\s\\p{Punct}]+");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}