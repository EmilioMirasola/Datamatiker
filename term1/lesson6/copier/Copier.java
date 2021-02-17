package term1.lesson6.copier;

public class Copier {
    private int paper;
    private boolean paperStuck;

    public Copier() {
    }

    public Copier(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return this.paper;
    }

    public void insertPaper(int papers) {
        if (this.paper + papers > 500) {
            System.out.println("Der er ikke nok plads i maskinen");
        } else {
            this.paper += papers;
        }
    }

    public void makeCopy(int copies) {
        if (this.paper - copies >= 0 && !this.paperStuck) {
            this.paper -= copies;
        } else if (paperStuck) {
            System.out.println("Der er paperjam!");
            fixPaperJam();
        } else {
            System.out.println("Ikke nok papir i printeren");
        }
    }

    public void makePaperJam() {
        this.paperStuck = true;
    }

    public void fixPaperJam() {
        this.paperStuck = false;
        System.out.println("Paperjam fixed!");
    }
}
