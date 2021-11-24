package term2.lesson22.bryghus;

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
