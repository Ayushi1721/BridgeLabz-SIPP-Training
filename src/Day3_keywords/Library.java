package Day3_keywords;

public class Library {
    static String libraryName = "Central Library";

    String title;
    String author;
    final String isbn;
    public Library(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; 
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Library.displayLibraryName();

        Library book1 = new Library("The Alchemist", "Paulo Coelho", "978-0061122415");

        if (book1 instanceof Library) {
            System.out.println("\nBook Details:");
            book1.displayDetails();
        } else {
            System.out.println("Not a valid Book object.");
        }
    }
}
