package term1.lesson26.opgave2;

public class Customer implements Comparable<Customer> {
    private String navn;
    private String efternavn;
    private int alder;

    public Customer(String navn, String efternavn, int alder) {
        this.navn = navn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.getEfternavn().compareTo(customer.getEfternavn());
    }

    @Override
    public String toString() {
        return this.getEfternavn();
    }
}
