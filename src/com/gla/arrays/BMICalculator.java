import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step b: Create arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step c: Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();

            // Step d: Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Step d: Determine status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step e: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }


    }
}
