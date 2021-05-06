package term1.lesson26.opgave2;

public class Customer implements Comparable<Customer> {
    private String navn;
    private final String efternavn;
    private final int alder;

    public Customer(String navn, String efternavn, int alder) {
        this.navn = navn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }


    public String getEfternavn() {
        return efternavn;
    }


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public int compareTo(Customer customer) {
        int sammenligning = this.getEfternavn().compareTo(customer.getEfternavn());
        if (sammenligning == 0) {
            sammenligning = this.getNavn().compareTo(customer.getNavn());
            if (sammenligning == 0) {
                sammenligning = this.getAlder() - customer.getAlder();
            }
        }
        return sammenligning;
    }

    @Override
    public String toString() {
        return this.getEfternavn();
    }


}


