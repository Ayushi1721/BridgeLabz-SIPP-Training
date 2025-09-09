package Day2_constructor.Level1;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("DSA", "Narasimha", 599.0);
        lb.borrowBook();
        lb.borrowBook();  // again trying to borrow
    }
}
