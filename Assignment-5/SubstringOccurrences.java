import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();

        System.out.println("Enter the substring to search:");
        String subString = sc.nextLine();

        int count = countOccurrences(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times.");

        sc.close();
    }
    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // Move past the last found substring
        }

        return count;
    }
}