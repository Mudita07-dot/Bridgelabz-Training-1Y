import java.util.Scanner;

public class LowerCaseComparison {

   
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);


            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                result.append((char)(ch + 32));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }


    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();


        String builtInLower = input.toLowerCase();


        String manualLower = manualToLowerCase(input);


        boolean isSame = compareStrings(builtInLower, manualLower);


        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Manual toLowerCase(): " + manualLower);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}