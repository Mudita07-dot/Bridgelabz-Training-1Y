public class MultipleBelow100{
    public static void main(String[] args) {
        int num = 5;
        for(int i=100; i >= 1; i--) {
            if(i % num == 0)
                System.out.println(i);
        }
    }
}