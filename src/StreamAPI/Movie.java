package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Movie {
    private String title;
    private double rating;
    private int releaseYear;

    public Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - " + rating;
    }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.1, 2023),
            new Movie("Movie B", 7.9, 2024),
            new Movie("Movie C", 9.0, 2022),
            new Movie("Movie D", 6.8, 2021),
            new Movie("Movie E", 8.5, 2023),
            new Movie("Movie F", 7.7, 2024)
        );

        List<Movie> top5 = movies.stream()
            .filter(m -> m.getRating() >= 7.5)
            .sorted(Comparator.comparing(Movie::getRating).reversed()
                    .thenComparing(Movie::getReleaseYear).reversed())
            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}


