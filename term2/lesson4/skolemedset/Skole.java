package term2.lesson4.skolemedset;

import java.util.ArrayList;
import java.util.HashSet;

public class Skole {
    private String navn;
    private HashSet<Studerende> studerendeListe;

    public Skole(String navn) {
        this.navn = navn;
        this.studerendeListe = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeListe.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeListe.remove(studerende);
    }

    public HashSet<Studerende> getStuderendeListe() {
        return studerendeListe;
    }

    public double gennemsnitStuderende() {
        double summeredeGennemsnit = 0;
        for (Studerende s : studerendeListe) {
            double summeredeKarakterer = 0;
            for (int k : s.getKarakterer()) {
                summeredeKarakterer += k;
            }
            summeredeGennemsnit += summeredeKarakterer / s.getKarakterer().size();
        }
        return summeredeGennemsnit / studerendeListe.size();
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende s : studerendeListe) {
            if (s.getStudieNr() == studieNr) {
                return s;
            }
        }
        return null;
    }
}
