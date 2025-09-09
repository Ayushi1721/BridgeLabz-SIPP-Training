package Day1_LinkedList;
import java.util.*;

class Book {
    int bookId;
    String title, author, genre;
    boolean available;
    Book next, prev;

    public Book(int bookId, String title, String author, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
        this.next = this.prev = null;
    }
}

class Library {
    Book head, tail;

    public void addBookAtEnd(int id, String title, String author, String genre) {
        Book newBook = new Book(id, title, author, genre);
        if (head == null) { head = tail = newBook; return; }
        tail.next = newBook;
        newBook.prev = tail;
        tail = newBook;
    }

    public void removeBookById(int id) {
        Book temp = head;
        while (temp != null && temp.bookId != id) temp = temp.next;
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next; else head = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev; else tail = temp.prev;
    }

    public void displayForward() {
        System.out.println("Library Books Forward:");
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    public void displayBackward() {
        System.out.println("Library Books Backward:");
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " Available: " + temp.available);
            temp = temp.prev;
        }
    }

    public void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) { if (temp.bookId == id) { temp.available = status; return; } temp = temp.next; }
    }

    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) { count++; temp = temp.next; }
        return count;
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBookAtEnd(1, "Java Basics", "John Doe", "Programming");
        lib.addBookAtEnd(2, "Python Guide", "Jane Smith", "Programming");
        lib.addBookAtEnd(3, "Algorithms", "Mark Allen", "CS");

        lib.displayForward();
        lib.updateAvailability(2, false);
        lib.displayBackward();

        System.out.println("Total Books: " + lib.countBooks());
    }
}
