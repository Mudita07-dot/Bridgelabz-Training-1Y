public class GreatestFactor{
    public static void main(String[] args) {
        int num = 36;
        int i = num - 1;
        while(i >= 1) {
            if(num % i == 0) {
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}