import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please re-enter.");
                i--; // decrement index to retry
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Processing loop
        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);


    }
}
