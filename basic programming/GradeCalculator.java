import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;
        if (avg >= 80)
            System.out.println("Grade A");
        else if (avg >= 70)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 50)
            System.out.println("Grade D");
        else if (avg >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");
    }
}