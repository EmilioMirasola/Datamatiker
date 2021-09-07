package term2.lesson4;

import java.util.ArrayList;

public class Skole {
    private String navn;
    private ArrayList<Studerende> studerendeListe;

    public Skole(String navn) {
        this.navn = navn;
        this.studerendeListe = new ArrayList<>();
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
