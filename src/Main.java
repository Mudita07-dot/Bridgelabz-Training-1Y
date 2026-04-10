public class Main {
    public static void main(String[] args) {
        RouteLinkedList<Checkpoint> myRoute = new RouteLinkedList<>();

        myRoute.addCheckpoint(new Delivery("D-101", 120.5, 100, 110));
        myRoute.addCheckpoint(new Fuel("F-50", 15.0, 20, 25));
        myRoute.addCheckpoint(new Rest("R-01", 5.0, 30, 80));

        double dist = myRoute.computeTotalDistance();
        double penalty = myRoute.computeTotalPenalty();

        System.out.println("--- Route Report ---");
        System.out.println("Consistent: " + myRoute.checkConsistency());
        System.out.println("Total Distance: " + dist);
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + (dist - penalty));
        myRoute.printRoute();
    }
}