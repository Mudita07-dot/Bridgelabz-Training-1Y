public class EmployeeBonus{
    public static void main(String[] args) {
        double salary = 20000;
        int years = 6;
        if(years > 5)
            System.out.println("Bonus = " + (salary * 0.05));
        else
            System.out.println("No Bonus");
    }
}