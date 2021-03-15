package term1.lesson17;

import java.time.LocalDate;

public class Rental {
    private int number;
    private int days;
    private LocalDate startDate;
    private double price;

    public Rental(int number, int days, LocalDate startDate, double price) {
        this.number = number;
        this.days = days;
        this.startDate = startDate;
        this.price = price;
    }


    /**
     * Returnerer prisen for udlejning pr. dag
     * @return prisen det koster for udlejning pr. dag
     */
    public double getPricePrDay() {
        return this.price;
    }

    /**
     * Registrerer antal dage, der skal udlejes
     * @param days antal dage for udlejning
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * Returnerer antal dage der udlejes
     * @return Antal dage der udlejes
     */
    public int getDays() {
        return this.days;
    }

    /**
     * Returnerer startdato for udlejning
     * @return Startdato for udlejning
     */
    public LocalDate getStartDate() {
        return this.startDate;
    }

    /**
     * 
     * @return Returnerer slutdatoen for en udlejning
     */
    public LocalDate getEndDate() {
        return getStartDate().plusDays(this.days);
    }

    
}
