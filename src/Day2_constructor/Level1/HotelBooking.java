package Day2_constructor.Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Rahul", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);  // copy

        System.out.println("Default  : " + b1.guestName + ", " + b1.roomType + ", " + b1.nights);
        System.out.println("Custom   : " + b2.guestName + ", " + b2.roomType + ", " + b2.nights);
        System.out.println("Copied   : " + b3.guestName + ", " + b3.roomType + ", " + b3.nights);
    }
}
