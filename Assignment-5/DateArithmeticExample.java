import java.time.LocalDate;

public class DateArithmeticExample {
    public static void main(String[] args) {

        LocalDate inputDate = LocalDate.of(2026, 2, 11); // Example: 11 Feb 2026
        System.out.println("Input Date: " + inputDate);


        LocalDate addedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);


        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}