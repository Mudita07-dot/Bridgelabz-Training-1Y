import java.util.Scanner;
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //FORMULS= (P+R+T)/1000
        System.out.print("Emter the Principle amount: ");
        float p= sc.nextFloat();
        System.out.print("Emter the Rate amount: ");
        float r= sc.nextFloat();
        System.out.print("Emter the time amount: ");
        float t= sc.nextFloat();

        float SI=(p*r*t)/100;

        System.out.print("simple interest is:"+SI);
    }}