public class Power{
    public static void main(String[] args) {
        int num = 2, power = 5, result = 1;
        for(int i=1; i <= power; i++)
            result = result * num;
        System.out.println(result);
    }
}