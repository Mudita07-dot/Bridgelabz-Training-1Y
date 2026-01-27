public class Multiples {
    public static void main(String[] args) {
        int num = 6, i = 1;
        while(i < 100) {
            if(i % num == 0)
                System.out.println(i);
            i++;
        }
    }
}