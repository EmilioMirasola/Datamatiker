package term2.lesson25;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
	private String registreringsnummer;
	private String mærke;
	private String model;
	private String color;

	@Override
	public String toString() {
		return mærke + " , " + model;
	}

	@Override
	public boolean equals(Object o) {
		Car other;
		if (o instanceof Car) {
			other = (Car) o;
			return getRegistreringsnummer().equals(other.getRegistreringsnummer()) && getMærke().equals(other.getMærke());
		}
		throw new ClassCastException("Kan ikke sammenligne en bil med en: " + o.getClass());
	}

	@Override
	public int hashCode() {
		return getRegistreringsnummer().hashCode() + getMærke().hashCode();
	}
}
