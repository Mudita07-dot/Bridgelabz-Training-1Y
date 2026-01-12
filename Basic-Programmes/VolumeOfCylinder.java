import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.printf("Enter radius: ");
        double r=sc.nextDouble();
        System.out.printf("Enter Height: ");
        double h= sc.nextDouble();
        double Area=3.14* r*r* h;
        System.out.printf("Arae of a cylinder is: "+Area);


    }
}
