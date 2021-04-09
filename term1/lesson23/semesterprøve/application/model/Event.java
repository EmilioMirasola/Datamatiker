package term1.lesson23.semesterprøve.application.model;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private final String name;
    private final boolean isPublic;
    private final List<Reservation> reservations;

    public Event(String name, boolean isPublic) {
        this.name = name;
        this.isPublic = isPublic;
        this.reservations = new ArrayList<>();
    }

    public boolean isPublic() {
        return isPublic;
    }

    public String getName() {
        return name;
    }

    public List<Reservation> getReservations() {
        return new ArrayList<Reservation>(reservations);
    }

    public void addReservation(Reservation reservation) {
        if (!reservations.contains(reservation)) {
            reservations.add(reservation);
        }
    }

    public void deleteReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public int numOfReservedSeats() {
        return reservations.size();
    }
}
