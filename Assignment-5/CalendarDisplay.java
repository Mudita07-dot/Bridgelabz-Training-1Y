import java.util.*;

public class CalendarDisplay {

    public static boolean isLeap(int year) {
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();

        String[] months = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (m==2 && isLeap(y)) days[2]=29;

        System.out.println(months[m] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        Calendar cal = Calendar.getInstance();
        cal.set(y, m-1, 1);
        int firstDay = cal.get(Calendar.DAY_OF_WEEK)-1;

        for(int i=0;i<firstDay;i++) System.out.print("    ");
        for(int d=1; d<=days[m]; d++){
            System.out.printf("%3d ", d);
            if((d+firstDay)%7==0) System.out.println();
        }
    }
}