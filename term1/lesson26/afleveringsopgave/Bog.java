package term1.lesson26.afleveringsopgave;

public class Bog {
    private String titel;
    private boolean paperBack;
    private double pris;

    public Bog(String titel, boolean paperBack, double pris) {
        this.titel = titel;
        this.paperBack = paperBack;
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public boolean isPaperBack() {
        return paperBack;
    }

    public String getTitel() {
        return titel;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double beregnUdsalgsPris() {
        return isPaperBack() ? getPris() * 0.6 : getPris() * 0.8;
    }

    public void printBog() {
        System.out.println("****************************************");
        System.out.println("Titel \t: " + this.getTitel() + "\t" + "Paperback: " + isPaperBack());
        System.out.println("Pris\t: \t\t\t\t" + this.getPris());
        System.out.println("Udsalg\t: \t\t\t\t" + this.beregnUdsalgsPris());
        System.out.println("****************************************");
    }
}
