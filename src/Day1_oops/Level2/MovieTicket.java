package Day1_oops.Level2;


public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public void bookTicket(String movie, int seat, double cost) {
        movieName = movie;
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Inception", 12, 250);
        ticket.displayTicket();
    }
}

