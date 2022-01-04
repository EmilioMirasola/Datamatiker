package term2.eksamensforberedelse.circularArrOgQueue.bryghus;

public class Produkt
{
    String navn;

    public Produkt(String navn)
    {
        this.navn = navn;
    }

    public String getNavn()
    {
        return navn;
    }

    @Override
    public String toString()
    {
        return navn;
    }
}
