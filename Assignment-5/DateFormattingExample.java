import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Format 1 (dd/MM/yyyy): " + currentDate.format(format1));
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2 (yyyy-MM-dd): " + currentDate.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + currentDate.format(format3));
    }
}