import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {


    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }


    public static String getFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter 'high' if my guess is too high, 'low' if too low, or 'correct' if I got it: ");
        return sc.nextLine().trim().toLowerCase();
    }
    public static int[] updateRange(int[] range, int guess, String feedback) {
        if (feedback.equals("high")) {
            range[1] = guess - 1; // reduce upper bound
        } else if (feedback.equals("low")) {
            range[0] = guess + 1; // increase lower bound
        }
        return range;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        int[] range = {1, 100};
        boolean found = false;

        while (!found && range[0] <= range[1]) {
            int guess = generateGuess(range[0], range[1]);
            String feedback = getFeedback(sc, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly!");
                found = true;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                range = updateRange(range, guess, feedback);
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Did you give consistent feedback?");
        }

        sc.close();
    }
}