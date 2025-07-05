package Day2_constructor.Level1;

public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Main method to test
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 599.99);

        System.out.println("Book 1 -> Title: " + b1.title + ", Author: " + b1.author + ", Price: " + b1.price);
        System.out.println("Book 2 -> Title: " + b2.title + ", Author: " + b2.author + ", Price: " + b2.price);
    }
}


