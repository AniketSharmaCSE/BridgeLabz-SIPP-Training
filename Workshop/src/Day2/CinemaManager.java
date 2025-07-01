package Day2;

import java.util.*;

public class CinemaManager {

    static List<String> titles = new ArrayList<>();
    static List<String> times = new ArrayList<>();

    // custom exception
    static class InvalidTimeFormatException extends Exception {
        public InvalidTimeFormatException(String message) {
            super(message);
        }
    }

    // add a movie
    public static void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!time.matches("\\d{2}:\\d{2}")) {
            throw new InvalidTimeFormatException("Invalid time: " + time);
        }
        titles.add(title);
        times.add(time);
    }

    // search movie
    public static void searchMovie(String keyword) {
        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + titles.get(i) + " at " + times.get(i));
            }
        }
    }

    // display all
    public static void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println((i + 1) + ". " + titles.get(i) + " at " + times.get(i));
        }
    }

    // report using arrays
    public static void printReport() {
        String[] t = titles.toArray(new String[0]);
        String[] ti = times.toArray(new String[0]);

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i] + " at " + ti[i]);
        }
    }

    public static void main(String[] args) {
        try {
            addMovie("Inception", "06:30");
            addMovie("Toy Story", "10:00");
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        searchMovie("toy");

        displayAllMovies();

        printReport();

        try {
            System.out.println(titles.get(5)); // force IndexOutOfBounds
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index error caught");
        }
    }
}
