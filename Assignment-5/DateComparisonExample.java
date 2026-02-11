import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstInput);
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondInput);


        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }
    }
}