package term2.daos.lesson7;

import java.time.LocalDate;

public class Skuespiller {
	private final String navn;
	private final int foedselsAar;

	public Skuespiller(String navn, int fødselsÅr) {
		this.navn = navn;
		this.foedselsAar = fødselsÅr;
	}

	public String getNavn() {
		return navn;
	}


	public int getFoedselsAar() {
		return foedselsAar;
	}

	@Override
	public String toString() {
		return "Navn: " + getNavn() + ", Alder: " + (LocalDate.now().getYear() - getFoedselsAar());
	}
}
