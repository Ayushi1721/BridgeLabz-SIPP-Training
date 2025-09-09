package Encapsulationsandpolymorphism;
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) { this.itemId=id; this.title=title; this.author=author; }
    public abstract int getLoanDuration();
    public void getItemDetails() { System.out.println(title + " by " + author); }
}

interface Reservable {
    void reserveItem(String user);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 21; }
    public void reserveItem(String user) { System.out.println("Book reserved by " + user); }
    public boolean checkAvailability() { return true; }
}

