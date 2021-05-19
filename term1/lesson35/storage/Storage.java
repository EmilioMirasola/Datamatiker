package term1.lesson35.storage;

import term1.lesson35.model.Festival;
import term1.lesson35.model.Frivillig;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static final List<Festival> festivaller = new ArrayList<>();
    private static final List<Frivillig> frivillige = new ArrayList<>();

    public static List<Festival> getFestivaller() {
        return new ArrayList<>(festivaller);
    }

    public static void tilføjFestival(Festival festival) {
        festivaller.add(festival);
    }

    public static void sletFestival(Festival festival) {
        festivaller.remove(festival);
    }

    public static List<Frivillig> getFrivillige() {
        return new ArrayList<>(frivillige);
    }

    public static void tilføjFrivillig(Frivillig frivillig) {
        frivillige.add(frivillig);
    }

    public static void sletFrivillig(Frivillig frivillig) {
        frivillige.remove(frivillig);
    }

}
