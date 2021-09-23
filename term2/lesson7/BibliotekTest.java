package term2.lesson7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotekTest {
	private Bibliotek bibliotek;
	private LocalDate startDato;
	private LocalDate slutDato;


	@BeforeEach
	public void setUp() {
		this.bibliotek = new Bibliotek();
	}

	@Test
	@Order(1)
	public void beregn_gebyr_barn_0_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now();

		//Assert
		assertEquals(0, bibliotek.beregnGebyr(startDato, slutDato, false));
	}

	@Test
	@Order(2)
	public void beregn_gebyr_barn_1_7_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(2);

		//Assert
		assertEquals(10, bibliotek.beregnGebyr(startDato, slutDato, false));
	}

	@Test
	@Order(3)
	public void beregn_gebyr_barn_8_14_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(10);

		//Assert
		assertEquals(30, bibliotek.beregnGebyr(startDato, slutDato, false));
	}

	@Test
	@Order(4)
	public void beregn_gebyr_barn_plus_15_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(20);

		//Assert
		assertEquals(45, bibliotek.beregnGebyr(startDato, slutDato, false));
	}

	@Test
	@Order(5)
	public void beregn_gebyr_voksen_0_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now();

		//Assert
		assertEquals(0, bibliotek.beregnGebyr(startDato, slutDato, true));
	}

	@Test
	@Order(6)
	public void beregn_gebyr_voksen_1_7_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(2);

		//Assert
		assertEquals(20, bibliotek.beregnGebyr(startDato, slutDato, true));
	}

	@Test
	@Order(7)
	public void beregn_gebyr_voksen_8_14_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(10);

		//Assert
		assertEquals(60, bibliotek.beregnGebyr(startDato, slutDato, true));
	}

	@Test
	@Order(8)
	public void beregn_gebyr_voksen_plus_15_dage() {
		//Assign
		this.startDato = LocalDate.now();
		this.slutDato = LocalDate.now().plusDays(20);

		//Assert
		assertEquals(90, bibliotek.beregnGebyr(startDato, slutDato, true));
	}
}
