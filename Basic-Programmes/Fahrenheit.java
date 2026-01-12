import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        int Celsius=sc.nextInt();
        int fah=(Celsius * 9/5) + 32;
        System.out.print("Celsius to Fahrenheit Conversion is: "+fah);

    }
}
