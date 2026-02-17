class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Cannot remove more than available quantity.");
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class Main {
    public static void main(String[] args) {
        CartItem item = new CartItem("Headphones", 2000, 1);
        item.addItem(2);
        item.displayCart();
    }
}
