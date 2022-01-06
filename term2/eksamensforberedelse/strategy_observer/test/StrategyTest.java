package term2.eksamensforberedelse.strategy_observer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import term2.eksamensforberedelse.strategy_observer.strategy.*;

@TestMethodOrder(OrderAnnotation.class)
class StrategyTest {
	private AcademicStudent student1;
	private AcademicStudent student2;
	private JungleCannibal cannibal;

	@BeforeEach
	void setUp() throws Exception {
		this.student1 = new AcademicStudent("Store Klaus", 100);
		this.student2 = new AcademicStudent("Lille Klaus", 50);
		this.cannibal = new JungleCannibal(50);
	}

	@Test
	@Order(1)
	void test_jungleCannibal_canBiteStudent() throws AcademicStudentException, JungleCannibalException {
		// --------------------------------------------------
		// ACT & ASSERT (Student 1)
		// --------------------------------------------------

		assertEquals(100, student1.getHealth());

		for (int expected = 95; expected >= 5; expected = expected - 5) {
			cannibal.biteStudent(student1);

			assertEquals(expected, student1.getHealth());
		}
		assertThrows(AcademicStudentException.class, () -> {
			cannibal.biteStudent(student1);
		});

		// --------------------------------------------------
		// ACT & ASSERT (Student 2)
		// --------------------------------------------------

		assertEquals(50, student2.getHealth());

		for (int expected = 45; expected >= 5; expected = expected - 5) {
			cannibal.biteStudent(student2);

			assertEquals(expected, student2.getHealth());
		}
		assertThrows(AcademicStudentException.class, () -> {
			cannibal.biteStudent(student2);
		});
	}

	@Test
	@Order(2)
	void test_academicStudent_canUseWeapon_pencilSharpener() throws JungleCannibalException {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		PencilSharpener sharpener = new PencilSharpener();

		student1.setWeapon(sharpener);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		assertEquals(1, sharpener.getCuttingDamage());

		assertEquals(50, cannibal.getHealth());

		for (int expected = 49; expected >= 0; expected--) {
			student1.useWeapon(cannibal);

			assertEquals(expected, cannibal.getHealth());
		}
		assertThrows(JungleCannibalException.class, () -> {
			student1.useWeapon(cannibal);
		});
	}

	@Test
	@Order(3)
	void test_can_change_weapon() throws JungleCannibalException {
		Weapon gun = new ModulusGun();
		student1.setWeapon(gun);
		assertEquals(gun, student1.getWeapon());

		Weapon lethalVirus = new LethalVirus();
		student1.setWeapon(lethalVirus);
		assertEquals(lethalVirus, student1.getWeapon());
	}

	@Test
	@Order(4)
	void test_can_change_weapon_and_use_them() throws JungleCannibalException {
		student1.setWeapon(new ModulusGun());
		student1.useWeapon(cannibal);
		assertEquals(30, cannibal.getHealth());

		student1.setWeapon(new LethalVirus());
		student1.useWeapon(cannibal);
		assertEquals(20, cannibal.getHealth());
	}

}
