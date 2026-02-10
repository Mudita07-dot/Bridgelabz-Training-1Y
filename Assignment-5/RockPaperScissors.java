import java.util.*;

public class RockPaperScissors {

    static String[] choices = {"rock", "paper", "scissors"};

    public static String computerChoice() {
        return choices[(int)(Math.random()*3)];
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();
            String comp = computerChoice();
            String result = winner(user, comp);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) compWins++;
            System.out.println("Computer: " + comp + " | Winner: " + result);
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
    }
}