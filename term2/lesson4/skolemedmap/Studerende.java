package term2.lesson4.skolemedmap;

import java.util.ArrayList;

public class Studerende implements Comparable<Studerende> {
    private int studieNr;
    private String navn;
    private ArrayList<Integer> karakterer;

    public Studerende(int studieNr, String navn, ArrayList<Integer> karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Integer> getKarakterer() {
        return karakterer;
    }

    public void addKarakter(int karakter) {
        this.karakterer.add(karakter);
    }

    @Override
    public int compareTo(Studerende o) {
        return this.studieNr - o.getStudieNr();
    }

    @Override
    public String toString() {
        return navn;
    }
}
