package term2.eksamensforberedelse.strategy_observer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import term2.eksamensforberedelse.strategy_observer.observer.JungleVulture;
import term2.eksamensforberedelse.strategy_observer.observer.StudentParent;
import term2.eksamensforberedelse.strategy_observer.strategy.AcademicStudent;
import term2.eksamensforberedelse.strategy_observer.strategy.AcademicStudentException;
import term2.eksamensforberedelse.strategy_observer.strategy.JungleCannibal;
import term2.eksamensforberedelse.strategy_observer.strategy.JungleCannibalException;

@TestMethodOrder(OrderAnnotation.class)
class ObserverTest {
	private StudentParent parent;
	private AcademicStudent student1;
	private AcademicStudent student2;
	private JungleCannibal cannibal;
	private JungleVulture vulture;

	@BeforeEach
	void setUp() throws Exception {
		this.parent = new StudentParent();
		this.student1 = new AcademicStudent("Store Klaus", 100);
		this.student2 = new AcademicStudent("Lille Klaus", 50);
		this.cannibal = new JungleCannibal(50);
		this.vulture = new JungleVulture();
	}

	@Test
	@Order(1)
	void test_studentParent_is_observing() throws AcademicStudentException, JungleCannibalException {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		student1.setParent(parent);
		student2.setParent(parent);
		student1.addObserver(parent);
		student2.addObserver(parent);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		assertEquals(2, parent.getNumberOfChildren());

		while (student1.getHealth() > 0) {
			cannibal.biteStudent(student1);
		}

		assertEquals(1, parent.getNumberOfChildren());

		while (student2.getHealth() > 0) {
			cannibal.biteStudent(student2);
		}

		assertEquals(0, parent.getNumberOfChildren());
	}

	@Test
	@Order(2)
	void test_vulture_is_observing() throws AcademicStudentException, JungleCannibalException {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------


		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------
		student1.addObserver(vulture);
		student2.addObserver(vulture);

		assertEquals(0, vulture.getNumberOfMeals());

		while (student1.getHealth() > 0) {
			cannibal.biteStudent(student1);
		}

		assertEquals(1, vulture.getNumberOfMeals());

		while (student2.getHealth() > 0) {
			cannibal.biteStudent(student2);
		}

		assertEquals(2, vulture.getNumberOfMeals());
	}
}
