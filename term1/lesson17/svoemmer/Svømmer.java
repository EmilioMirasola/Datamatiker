package term1.lesson17.svoemmer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Svømmer {
    private String navn;
    private String klub;
    private LocalDate føldselsdag;
    private ArrayList<Double> tider;

    public Svømmer(String navn, String klub, LocalDate føldselsdag, ArrayList<Double> tider) {
        this.navn = navn;
        this.klub = klub;
        this.føldselsdag = føldselsdag;

        if (tider.size() > 1) {
            this.tider = tider;
        }
    }

    public String getName() {
        return this.navn;
    }

    public int getYear() {
        return this.føldselsdag.getYear();
    }

    public String getClub() {
        return this.klub;
    }

    public void setClub(String klub) {
        this.klub = klub;
    }

    public double bedsteTid() {
        if (this.enoughTimes()) {
            double bestTime = this.tider.get(0);
            for (double tid : this.tider) {
                if (tid < bestTime) {
                    bestTime = tid;
                }
            }
            return bestTime;
        } else {
            return -1;
        }
    }

    public double gennemSnitAfTid() {
        if (this.enoughTimes()) {
            double sum = 0;
            for (double tid : this.tider) {
                sum += tid;
            }
            return sum / this.tider.size();
        } else {
            return -1;
        }
    }

    public double snitUdenDårligste() {
        if (this.enoughTimes()) {
            double sum = 0;
            double worst = 0;

            for (double tid : this.tider) {
                if (tid > worst) {
                    worst = tid;
                }
                sum += tid;
            }
            sum -= worst;
            return sum / this.tider.size() - 1;
        } else {
            return -1;
        }
    }

    private boolean enoughTimes() {
        if (this.tider.size() > 1) {
            return true;
        } else {
            return false;
        }
    }
}
