package term2.lesson4.skolemedmap;

import java.util.HashMap;

public class Skole {
    private String navn;
    private HashMap<Integer, Studerende> studerendeListe;

    public Skole(String navn) {
        this.navn = navn;
        this.studerendeListe = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        studerendeListe.put(studerende.getStudieNr(), studerende);
    }

    public void removeStuderende(Studerende studerende) {
        studerendeListe.remove(studerende.getStudieNr());
    }

    public HashMap<Integer, Studerende> getStuderendeListe() {
        return studerendeListe;
    }

    public double gennemsnitStuderende() {
        double summeredeGennemsnit = 0;

        for (Studerende s : studerendeListe.values()) {
            double summeredeKarakterer = 0;
            for (int k : s.getKarakterer()) {
                summeredeKarakterer += k;
            }
            summeredeGennemsnit += summeredeKarakterer / s.getKarakterer().size();
        }

        return summeredeGennemsnit / studerendeListe.size();
    }

    public Studerende findStuderende(int studieNr) {
        return studerendeListe.get(studieNr);
    }
}
