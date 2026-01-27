public class PowerUsingWhile
 {
    public static void main(String[] args) {
        int num = 2, power = 6, result = 1, i = 0;
        while(i < power) {
            result *= num;
            i++;
        }
        System.out.println(result);
    }
}