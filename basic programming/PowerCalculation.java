public class PowerCalculation{
    public static void main(String[] args) {
        int num = 3, power = 4, result = 1;
        for(int i=1; i <= power; i++)
            result *= num;
        System.out.println(result);
    }
}