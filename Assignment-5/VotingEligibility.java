import java.util.*;

public class VotingEligibility {

    public static void main(String[] args) {
        Random r = new Random();
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) ages[i] = r.nextInt(60);

        System.out.println("Age | Can Vote");
        for (int age : ages) {
            System.out.println(age + " | " + (age >= 18));
        }
    }
}