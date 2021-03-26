package term1.lesson21.opgave4;

public class Lejer {
    private String navn;
    private String uddannelse;

    public Lejer(String navn, String uddannelse) {
        this.navn = navn;
        this.uddannelse = uddannelse;
    }

    public String getUddannelse() {
        return uddannelse;
    }

    public String getNavn() {
        return navn;
    }

}
