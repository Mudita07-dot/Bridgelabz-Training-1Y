import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);


        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // ASCII size

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        int maxCount = -1;
        char result = ' ';

        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                result = ch;
            }
        }

        return result;
    }
}