package term2.lesson4.skolemedmap;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {

    @Override
    public int compare(Studerende o1, Studerende o2) {
        if (o1.getNavn().equals(o2.getNavn())) {
            return 0;
        } else {
            return o1.compareTo(o2);
        }
    }
}
