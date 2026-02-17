class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("I101", "Laptop", 60000);
        item1.displayDetails();
        System.out.println("Total Cost (2 items): " + item1.calculateTotalCost(2));
    }
}
