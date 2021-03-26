package term1.lesson21.opgave4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMaaned;
    private Kollegie kollegie;
    private ArrayList<Lejeaftale> lejeaftaler = new ArrayList<Lejeaftale>();

    public Bolig(int kvm, String adresse, int prisPrMaaned, Kollegie kollegie) {
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMaaned = prisPrMaaned;
        this.kollegie = kollegie;
    }

    public ArrayList<Lejeaftale> getLejeaftaler() {
        return lejeaftaler;
    }

    public Lejeaftale opretLejeaftale(LocalDate fraDato) {
        Lejeaftale lejeaftale = new Lejeaftale(fraDato, this);
        this.lejeaftaler.add(lejeaftale);
        return lejeaftale;
    }

    public void sletLejeaftale(Lejeaftale lejeaftale) {
        if (this.lejeaftaler.contains(lejeaftale)) {
            this.lejeaftaler.remove(lejeaftale);
        }
    }

    public Kollegie getKollegie() {
        return kollegie;
    }

    public int getPrisPrMaaned() {
        return prisPrMaaned;
    }

    public int getKvm() {
        return kvm;
    }

    public void setKvm(int kvm) {
        this.kvm = kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPrisPrMaaned(int prisPrMaaned) {
        this.prisPrMaaned = prisPrMaaned;
    }

}
