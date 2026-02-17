class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 2000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental("Sanjeev", "Hyundai Creta", 5);
        rental.display();
    }
}
