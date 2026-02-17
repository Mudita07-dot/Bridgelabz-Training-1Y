class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Data Structures", "Mark Allen", 799);

        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
