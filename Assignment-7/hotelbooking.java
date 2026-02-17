class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;


    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    public HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class Main {
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}
