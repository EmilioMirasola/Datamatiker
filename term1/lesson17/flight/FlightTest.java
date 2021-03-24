package term1.lesson17.flight;

import java.time.LocalDateTime;

public class FlightTest {

    public static void main(String[] args) {
        Flight flight = new Flight("AY025", "Seoul");
        flight.createPassenger("Arnold", 31);
        flight.createPassenger("Bruce", 59);
        flight.createPassenger("Dolph", 24);
        flight.createPassenger("Linda", 59);
        flight.createPassenger("Jennifer", 65);
        flight.setDepartDate(LocalDateTime.now().plusDays(1));
        flight.setLandDate(flight.getDepartDate().plusDays(1));
        // flight.setLandDate(flight.getDepartDate().plusHours(5));
        System.out.println("Passenger average age: " + flight.passengerAveAge());
        flight.removePassenger(flight.getPassengers().get(0));
        System.out.println("Passenger average age: " + flight.passengerAveAge());
        System.out.println("Flight time in hours: " + flight.flightDurationInHours());
        System.out.println("Is during midnight?: " + flight.midnightFlight());
    }
}
