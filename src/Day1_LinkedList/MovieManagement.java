package Day1_LinkedList;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieManagement {
    Movie head = null, tail = null;
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }
    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found: " + title);
    }
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found: " + title);
    }
    public void displayForward() {
        System.out.println("\nMovies (Forward):");
        Movie temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        System.out.println("\nMovies (Reverse):");
        Movie temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    private void displayMovie(Movie m) {
        System.out.println(m.title + " | " + m.director + " | " + m.year + " | " + m.rating);
    }

    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();

        mm.addAtBeginning("khiladi", "kk", 2010, 8.8);
        mm.addAtEnd("hum", "mukesh", 2014, 8.8);
        mm.addAtPosition(2, "veer zara", "yash raj", 2000, 9.0);

        mm.displayForward();
        mm.displayReverse();

        mm.searchByDirector("yash raj");
        mm.searchByRating(9.0);

        mm.updateRating("veer zara", 9.9);
        mm.removeByTitle("khiladi");

        mm.displayForward();
    }
}