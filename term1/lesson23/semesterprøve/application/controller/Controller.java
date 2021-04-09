package term1.lesson23.semesterprøve.application.controller;

import term1.lesson23.semesterprøve.application.model.Area;
import term1.lesson23.semesterprøve.application.model.Event;
import term1.lesson23.semesterprøve.application.model.Reservation;
import term1.lesson23.semesterprøve.application.model.Seat;
import term1.lesson23.semesterprøve.storage.Storage;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Controller {

    public static Event createEvent(String name, boolean isPublic) {
        Event event = new Event(name, isPublic);
        Storage.addEvent(event);
        return event;
    }

    public static Seat createSeat(int number, Area seatArea) {
        Seat seat = new Seat(number, seatArea);
        Storage.addSeat(seat);
        return seat;
    }

    public static Reservation createReservation(Event event, LocalDateTime start, LocalDateTime end, ArrayList<Seat> seats) {
        Reservation reservation = new Reservation(start, end, seats);
        event.addReservation(reservation);
        return reservation;
    }

    public static Reservation createReservation(LocalDateTime start, LocalDateTime end, ArrayList<Seat> seats) {
        return new Reservation(start, end, seats);
    }

    public static void initStorage() {
        Event dota2 = createEvent("Dota 2 tournament", true);
        Event CSGO = createEvent("CS GO tournament", false);

        Seat seat1 = createSeat(1, Area.TOURNAMENT);
        Seat seat2 = createSeat(2, Area.TOURNAMENT);
        Seat seat3 = createSeat(3, Area.STANDARD);
        Seat seat4 = createSeat(4, Area.STANDARD);
        Seat seat5 = createSeat(5, Area.KIDS);
        Seat seat6 = createSeat(6, Area.VIP);

        ArrayList<Seat> seatList = new ArrayList<>();

        //Reservaiton 1
        seatList.add(seat1);
        seatList.add(seat2);
        createReservation(dota2, LocalDateTime.of(2019, Month.AUGUST, 12, 20, 0), LocalDateTime.of(2019, Month.AUGUST, 12, 20, 0), seatList);

        //Reservaiton 2
        seatList.clear();
        seatList.add(seat3);
        seatList.add(seat4);
        createReservation(LocalDateTime.of(2019, Month.AUGUST, 13, 19, 0), LocalDateTime.of(2019, Month.AUGUST, 14, 6, 0), seatList);

        //Reservaiton 3
        seatList.clear();
        seatList.add(seat6);
        createReservation(LocalDateTime.of(2019, Month.AUGUST, 14, 19, 0), LocalDateTime.of(2019, Month.AUGUST, 15, 6, 0), seatList);
    }

    public static ArrayList<Seat> getSeats() {
        return Storage.getSeats();
    }
}
