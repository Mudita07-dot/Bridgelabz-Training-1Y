import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = sc.nextDouble();

        double areaSqInches = 0.5 * baseInches * heightInches;

    
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

   
        double areaSqCm = 0.5 * baseCm * heightCm;

       
        System.out.println("Area of the triangle:");
        System.out.println("In square inches: " + areaSqInches);
        System.out.println("In square centimeters: " + areaSqCm);
    }
}