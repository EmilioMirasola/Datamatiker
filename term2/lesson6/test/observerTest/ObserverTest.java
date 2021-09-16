package term2.lesson6.test.observerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import term2.lesson6.observer.JungleVulture;
import term2.lesson6.observer.StudentParent;
import term2.lesson6.strategy.AcademicStudent;
import term2.lesson6.strategy.AcademicStudentException;
import term2.lesson6.strategy.JungleCannibal;
import term2.lesson6.strategy.JungleCannibalException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
class ObserverTest {
	private StudentParent parent;
	private AcademicStudent student1;
	private AcademicStudent student2;
	private JungleCannibal cannibal;
	private JungleVulture jungleVulture;

	@BeforeEach
	void setUp() throws Exception {
		this.parent = new StudentParent();
		this.student1 = new AcademicStudent("Store Klaus", 100);
		this.student2 = new AcademicStudent("Lille Klaus", 50);
		this.cannibal = new JungleCannibal(50);
		this.jungleVulture = new JungleVulture();
	}

	@Test
	@Order(1)
	void test_studentParent_isObserving() throws AcademicStudentException, JungleCannibalException {
		// --------------------------------------------------
		// ARRANGE
		// --------------------------------------------------

		student1.setParent(parent);
		student1.addObserver(parent);
		student1.addObserver(jungleVulture);

		student2.setParent(parent);
		student2.addObserver(parent);
		student2.addObserver(jungleVulture);

		cannibal.addObserver(parent);

		// --------------------------------------------------
		// ACT & ASSERT
		// --------------------------------------------------

		assertEquals(2, parent.getNumberOfChildren());

		for (int expected = 100; expected >= 5; expected -= 5) {
			cannibal.biteStudent(student1);
		}

		assertEquals(1, parent.getNumberOfChildren());
		assertEquals(1, jungleVulture.getNumberOfMeals());

		for (int expected = 50; expected >= 5; expected = expected - 5) {
			cannibal.biteStudent(student2);
		}

		assertEquals(0, parent.getNumberOfChildren());
		assertEquals(2, jungleVulture.getNumberOfMeals());

		while (cannibal.getHealth() > 0) {
			cannibal.dealDamage(5);
		}

		System.out.println("Antal børn: " + parent.getNumberOfChildren());
	}
}
