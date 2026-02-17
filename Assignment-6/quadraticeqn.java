import java.util.Scanner;

public class QuadraticEquation {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) return new double[0];

        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }

        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0)
            System.out.println("No real roots");
        else
            for (double r : roots)
                System.out.println("Root: " + r);
    }
}
