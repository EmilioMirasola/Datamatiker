package term1.lesson25.opgave5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Indkøbsvogn {
    List<Vare> varer;

    public Indkøbsvogn() {
        this.varer = new ArrayList<>();
    }

    public void addVare(Vare vare) {
        if (!varer.contains(vare)) {
            varer.add(vare);
        }
    }

    public void fjernVare(Vare vare) {
        if (varer.contains(vare)) {
            varer.remove(vare);
        }
    }

    public double beregnTotalPris() {
        return varer.stream().mapToDouble(Vare::beregnPris).sum();
    }
}
