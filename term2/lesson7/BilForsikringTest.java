package term2.lesson7;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BilForsikringTest {
	private BilForsikring bilForsikring;


	@Before
	public void setUp() {
		this.bilForsikring = new BilForsikring();
	}

	@Test
	@Order(1)
	public void beregn_praemie_alder_under_18() {
		//Arrange
		bilForsikring.setGrundpaemie(1);

		//Assert
		assertThrows(RuntimeException.class, () -> {
			//Act
			bilForsikring.beregnPraemie(17, false, 4);
		});
	}

	@Test
	@Order(2)
	public void beregn_praemie_alder_minus_skadesfrie_aar() {
		//Arrange
		bilForsikring.setGrundpaemie(100);

		//Assert
		assertThrows(RuntimeException.class, () -> {
			//Act
			System.out.println(bilForsikring.beregnPraemie(18, false, 4));
		});
	}

	@Test
	@Order(3)
	public void beregn_praemie_skadesfrie_aar_negativ() {
		//Arrange
		bilForsikring.setGrundpaemie(100);

		//Assert
		assertThrows(RuntimeException.class, () -> {
			//Act
			System.out.println(bilForsikring.beregnPraemie(22, false, -3));
		});
	}

	@Test
	@Order(4)
	public void beregn_praemie_under_25_0_skadesfrie_aar() {
		//Arrange
		int grundPraemie = 100;
		bilForsikring.setGrundpaemie(grundPraemie);


		//Act
		double faktiskPraemie = bilForsikring.beregnPraemie(22, false, 0);

		//Assert
		assertEquals(grundPraemie * 1.25, faktiskPraemie);
	}

	@Test
	@Order(5)
	public void beregn_praemie_under_25_0_skadesfrie_aar_somKvinde() {
		//Arrange
		int grundPraemie = 100;
		bilForsikring.setGrundpaemie(grundPraemie);

		//Act
		double expectedPraemie = bilForsikring.beregnPraemie(22, true, 0);

		//Assert
		assertEquals((grundPraemie * 1.25) * 0.95, expectedPraemie);
	}

	@Test
	@Order(5)
	public void beregn_praemie_under_25_3_skadesfrie_aar_somKvinde() {
		//Arrange
		int grundPraemie = 100;
		bilForsikring.setGrundpaemie(grundPraemie);

		//Act
		double expectedPraemie = bilForsikring.beregnPraemie(22, true, 3);

		//Assert
		assertEquals((grundPraemie * 1.25) * 0.95 * 0.85, expectedPraemie);
	}

	@Test
	@Order(6)
	public void beregn_praemie_over_25_6_skadesfrie_aar_somKvinde() {
		//Arrange
		int grundPraemie = 100;
		bilForsikring.setGrundpaemie(grundPraemie);

		//Act
		double expectedPraemie = bilForsikring.beregnPraemie(26, true, 6);

		//Assert
		assertEquals(grundPraemie * 0.95 * 0.75, expectedPraemie);
	}

	@Test
	@Order(7)
	public void beregn_praemie_over_25_9_skadesfrie_aar_somKvinde() {
		//Arrange
		int grundPraemie = 100;
		bilForsikring.setGrundpaemie(grundPraemie);

		//Act
		double expectedPraemie = bilForsikring.beregnPraemie(30, true, 9);

		//Assert
		assertEquals(grundPraemie * 0.95 * 0.65, expectedPraemie);
	}
}
