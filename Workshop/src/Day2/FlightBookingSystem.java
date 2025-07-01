package Day2;

import java.util.*;

public class FlightBookingSystem {

    // Flight class 
    static class Flight {
        String flightNumber;
        String destination;

        Flight(String flightNumber, String destination) {
            this.flightNumber = flightNumber;
            this.destination = destination;
        }
    }

    // Booking class
    static class Booking {
        String userName;
        String flightNumber;

        Booking(String userName, String flightNumber) {
            this.userName = userName;
            this.flightNumber = flightNumber;
        }
    }

    // Array of available flights
    static Flight[] flights = {
        new Flight("AI101", "Delhi"),
        new Flight("AI202", "Mumbai"),
        new Flight("AI303", "Bangalore"),
        new Flight("AI404", "Chennai")
    };

    // List to store bookings
    static List<Booking> bookings = new ArrayList<>();

    // Method to search for flights
    public static void searchFlights(String destination) {
        System.out.println("Available flights to " + destination + ":");
        boolean found = false;
        for (Flight f : flights) {
            if (f.destination.equalsIgnoreCase(destination)) {
                System.out.println("Flight No: " + f.flightNumber + " to " + f.destination);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found for this destination.");
        }
    }

    // Method to book a flight
    public static void bookFlight(String userName, String flightNumber) {
        boolean flightExists = false;
        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                flightExists = true;
                bookings.add(new Booking(userName, flightNumber));
                System.out.println("Booking confirmed for " + userName + " on flight " + flightNumber);
                break;
            }
        }
        if (!flightExists) {
            System.out.println("Flight number not found. Booking failed.");
        }
    }

    // Method to display all bookings
    public static void displayBookings() {
        System.out.println("\nAll Bookings:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            for (Booking b : bookings) {
                System.out.println("User: " + b.userName + " Flight: " + b.flightNumber);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        searchFlights("Mumbai");
        bookFlight("Aniket", "AI202");
        bookFlight("Riya", "AI404");
        displayBookings();
    }
}
