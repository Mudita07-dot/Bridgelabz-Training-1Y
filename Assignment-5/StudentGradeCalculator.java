import java.util.*;

public class StudentGradeCalculator {

    public static String grade(double percent) {
        if (percent >= 80) return "A";
        if (percent >= 70) return "B";
        if (percent >= 60) return "C";
        if (percent >= 50) return "D";
        if (percent >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
        Random r = new Random();
        int students = 5;
        System.out.println("P  C  M | % | Grade");
        for (int i = 0; i < students; i++) {
            int p = r.nextInt(100);
            int c = r.nextInt(100);
            int m = r.nextInt(100);
            double percent = Math.round(((p+c+m)/3.0)*100.0)/100.0;
            System.out.println(p+" "+c+" "+m+" | "+percent+" | "+grade(percent));
        }
    }
}