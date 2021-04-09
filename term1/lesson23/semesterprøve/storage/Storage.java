package term1.lesson23.semesterprøve.storage;

import term1.lesson23.semesterprøve.application.model.Event;
import term1.lesson23.semesterprøve.application.model.Reservation;
import term1.lesson23.semesterprøve.application.model.Seat;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Event> events = new ArrayList<>();
    private static ArrayList<Reservation> reservations = new ArrayList<>();
    private static ArrayList<Seat> seats = new ArrayList<>();

    public static ArrayList<Event> getEvents() {
        return new ArrayList<>(events);
    }

    public static  ArrayList<Seat> getSeats() {
        return new ArrayList<>(seats);
    }

    public static ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }

    public static void addReservation(Reservation reservation) {
        if (!reservations.contains(reservation)) {
            reservations.add(reservation);
        }
    }

    public static void addEvent(Event event) {
        if (!events.contains(event)) {
            events.add(event);
        }
    }

    public static void addSeat(Seat seat) {
        if (!seats.contains(seat)) {
            seats.add(seat);
        }
    }
}
