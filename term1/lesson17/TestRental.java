package term1.lesson17;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import term1.consoleColors.ConsoleColors;

public class TestRental {
    public static void main(String[] args) {
        Rental r1 = new Rental(1, 5, LocalDate.of(2021, Month.APRIL, 1), 1000);
        Rental r2 = new Rental(1, 10, LocalDate.now().plusMonths(10), 1000);

        // R1
        System.out.println(ConsoleColors.GREEN + "R1" + ConsoleColors.RESET);
        System.out.println("Total pris: " + r1.getDays() * r1.getPricePrDay());
        System.out.println("Slutdato: " + r1.getEndDate());
        System.out.println("Dagen før startdato: " + r1.getStartDate().minusDays(1));

        System.out.println();

        // R2
        System.out.println(ConsoleColors.GREEN + "R2" + ConsoleColors.RESET);
        System.out.println("Total pris: " + r2.getDays() * r2.getPricePrDay());
        System.out.println("Slutdato: " + r2.getEndDate());
        System.out.println("Dagen før startdato: " + r2.getStartDate().minusDays(1));

        System.out.println();

        // Forskel
        System.out.println(
                "Forskel mellem startdatoer: " + "År: " + ChronoUnit.YEARS.between(r1.getStartDate(), r2.getStartDate())
                        + " , Måneder; " + ChronoUnit.MONTHS.between(r1.getStartDate(), r2.getStartDate()) + " , Dage: "
                        + ChronoUnit.DAYS.between(r1.getStartDate(), r2.getStartDate()) + " dage");
    }
}
