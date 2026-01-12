import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter base number: ");
    int a=sc.nextInt();
    System.out.print("Enter exponent number: ");
    int b= sc.nextInt();
    double c=Math.pow(a,b);
    System.out.printf("Answer is: "+ c);

    }
}
