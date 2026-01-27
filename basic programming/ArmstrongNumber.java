import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while (original != 0) {
            int digit = original % 10;
            sum = sum + digit * digit * digit;
            original = original / 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}