package term1.lesson20.opgave5;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private ArrayList<Episode> episodes;

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;
        this.episodes = new ArrayList<Episode>();
    }

    public Episode createEpisode(int number, ArrayList<String> guestActors, int lengthMinutes) {
        Episode episode = new Episode(number, guestActors, lengthMinutes);
        this.episodes.add(episode);
        return episode;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public String getTitle() {
        return title;
    }

    public int totalLength() {
        int sum = 0;
        for (Episode episode : this.episodes) {
            sum += episode.getLengthMinutes();
        }
        return sum;
    }

    public ArrayList<String> getGuestActors() {
        ArrayList<String> allGuestActors = new ArrayList<String>();

        for (Episode episode : this.episodes) {
            allGuestActors.addAll(episode.getGuestActors());

            // Gør det samme..
            // for (String actor : episode.getGuestActors()) {
            // allActors.add(actor);
            // }
        }
        return allGuestActors;
    }
}
