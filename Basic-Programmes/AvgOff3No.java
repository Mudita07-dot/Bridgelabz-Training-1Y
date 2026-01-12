import java.util.Scanner;
public class AvgOff3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 no: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int avg =(num1+num2+num3)/3;
        System.out.print("the avg of 3 no is: "+avg);
    }
}
