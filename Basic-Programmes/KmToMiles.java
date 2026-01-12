import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter km: ");
    double km=sc.nextDouble();
    double miles= km * 0.621371;
    System.out.printf("Kilometers to miles: "+miles);


    }
}
