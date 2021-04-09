package term1.lesson23.semesterprøve.application.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private final LocalDateTime start;
    private final LocalDateTime end;
    private List<Seat> seats;


    public Reservation(LocalDateTime start, LocalDateTime end, List<Seat> seats) {
        this.start = start;
        this.end = end;
        this.seats = seats;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public List<Seat> getSeats() {
        return new ArrayList<Seat>(seats);
    }

    public void addSeat(Seat seat) {
        if (!seats.contains(seat)) {
            seats.add(seat);
        }
    }

    public void removeSeat(Seat seat) {
        seats.remove(seat);
    }
}
