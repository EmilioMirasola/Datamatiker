package term2.eksamensforberedelse.circular_array_queue__deque.bryghus;

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
