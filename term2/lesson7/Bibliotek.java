package term2.lesson7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {

	public double beregnGebyr(LocalDate startDato, LocalDate slutDato, boolean voksen) {
		double gebyr = 0;
		int antalDage = (int) ChronoUnit.DAYS.between(startDato, slutDato);

		//Overskridelse
		if (antalDage == 0) {
			return gebyr;
		} else if (antalDage < 8) {
			if (voksen) {
				gebyr += 20;
			} else {
				gebyr += 10;
			}
		} else if (antalDage < 15) {
			if (voksen) {
				gebyr += 60;
			} else {
				gebyr += 30;
			}
		} else {
			if (voksen) {
				gebyr += 90;
			} else {
				gebyr += 45;
			}
		}

		return gebyr;
	}

}
