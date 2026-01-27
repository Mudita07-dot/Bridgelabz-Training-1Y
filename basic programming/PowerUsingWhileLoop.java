public class PowerUsingWhileLoop{
    public static void main(String[] args) {
        int num = 2, power = 4, result = 1, i = 0;
        while(i < power) {
            result = result * num;
            i++;
        }
        System.out.println(result);
    }
}