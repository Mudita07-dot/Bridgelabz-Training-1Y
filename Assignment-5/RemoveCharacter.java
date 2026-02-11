import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char chToRemove = sc.next().charAt(0);

        String modified = removeCharacter(input, chToRemove);
        System.out.println("Modified String: " + modified);

        sc.close();
    }
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }

        return result.toString();
    }
}