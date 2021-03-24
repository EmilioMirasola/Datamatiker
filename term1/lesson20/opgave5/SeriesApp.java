package term1.lesson20.opgave5;

import java.util.ArrayList;

public class SeriesApp {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<String>();
        cast.add("Emilio");
        Series series = new Series("The wolf of Niels Juels gade", cast);

        for (int i = 1; i < 6; i++) {
            series.createEpisode(i, cast, 15);
        }

        System.out.println("Total længde af TV serie: " + series.totalLength());
        System.out.println("Alle gæsteskuespillere: " + series.getGuestActors());
    }
}
