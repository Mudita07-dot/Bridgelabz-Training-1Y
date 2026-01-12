import java.util.Scanner;

public class PeriOffARect {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length: ");
    double l=sc.nextDouble();
    System.out.printf("Enter the breadth: ");
    double b=sc.nextDouble();
    double per=2*(l+b);
    System.out.printf("Perimeter of a rectangle is: "+per);
    }
}
