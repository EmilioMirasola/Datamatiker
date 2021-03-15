package term1.lesson17.flight;

import java.security.cert.PKIXRevocationChecker.Option;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Optional;

/**
 * A flight with an airline between airports.
 */
public class Flight {
    private String flightNumber;
    private String destination;
    private LocalDateTime departDate;
    private LocalDateTime arrivalDate;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    /**
     * Constructor that creates a flight for an airline.
     * 
     * @param flightNumber the number of the flight
     * @param destination  the destination of the flight
     */
    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    /**
     * Gets the destination.
     * 
     * @return the destination or null if not set
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the flight number.
     * 
     * @return the flight number
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the LocalDateTime when the flight will depart
     * 
     * @return departure date, can be null
     */
    public LocalDateTime getDepartDate() {
        return this.departDate;
    }

    /**
     * Sets the LocalDateTime when the flight will depart. Precondition: cannot be
     * later than the land time.
     * 
     * @param departDate
     */
    public void setDepartDate(LocalDateTime departDate) {
        this.departDate = departDate;
    }

    /**
     * Gets the LocalDateTime for when the flight will land.
     * 
     * @return arrival date, can be null
     */
    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the LocalDateTime for when the flight will land. Precondition: cannot be
     * before the depart time.
     * 
     * @param landDate arrival date
     */
    public void setLandDate(LocalDateTime landDate) {
        if (landDate.isAfter(this.departDate)) {
            this.arrivalDate = landDate;
        } else {
            System.out.println("Landing date is not after departure!");
        }
    }

    /**
     * Creates a passenger with name and age Precondition: name is not empty or null
     * and age >= 0.
     * 
     * @param name name of the passenger
     * @param age  the age of the passenger
     * @return the newly created passenger object
     */
    public Passenger createPassenger(String name, int age) {
        Passenger p = new Passenger(name, age);
        this.passengers.add(p);
        return p;
    }

    /**
     * Removes the passenger. Precondition: the passenger must exists on this
     * flight.
     * 
     * @param passenger
     */
    public void removePassenger(Passenger passenger) {
        if (this.passengers.contains(passenger)) {
            this.passengers.remove(passenger);
        } else {
            System.out.println("Passenger not found");
        }
    }

    /**
     * Gets the current list of passengers on this flight
     * 
     * @return list of passengers
     */
    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    /**
     * The duration of the flight measured in hours Precondition: the depart and
     * arrival dates must have been set
     * 
     * @return how many hours
     */
    public double flightDurationInHours() {
    if (this.departDate != null && this.arrivalDate != null) {
    return ChronoUnit.HOURS.between(this.departDate, this.arrivalDate);
    } else {
        return -1;
    }
    }

    /**
     * Returns true if the flight happens during midnight of the day of departure.
     * Precondition: depart and arrival dates must have been set
     * 
     * @return true if midnight is included in the flight period, otherwise false.
     */
    public boolean midnightFlight() {
        if (this.departDate != null && this.arrivalDate != null) {
            if (this.departDate.getDayOfWeek() != this.arrivalDate.getDayOfWeek()) {
                return true;
            } else {
                return false; // and don't just return false :)
            }
        } else {
            System.out.println("Missing departure or landing date!");
            return false;
        }
    }

    /**
     * Gets the average age of all the passengers Precondition: there must exists
     * passengers on this flight
     * 
     * @return average age of passengers
     */
    public double passengerAveAge() {
        if (this.passengers.size() > 0) {
            int sum = 0;
            for (Passenger passenger : passengers) {
                sum += passenger.getAge();
            }
            return sum/passengers.size();
        } else {
            return -1;
        }
    }
}
