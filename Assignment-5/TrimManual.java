import java.util.*;

public class TrimManual {

    public static String manualTrim(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Manual: [" + manualTrim(text) + "]");
        System.out.println("Built-in: [" + text.trim() + "]");
    }
}