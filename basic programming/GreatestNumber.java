public class GreatestNumber {
    public static void main(String[] args) {
        int num = 24;
        for(int i=num-1; i >= 1; i--) {
            if(num % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}