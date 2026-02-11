import java.util.Scanner;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void performConversion(Scanner sc) {
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = fahrenheitToCelsius(f);
            System.out.println(f + "°F = " + c + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = celsiusToFahrenheit(c);
            System.out.println(c + "°C = " + f + "°F");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        performConversion(sc);

        sc.close();
    }
}