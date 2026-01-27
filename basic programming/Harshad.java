import java.util.*;
class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if(num % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}