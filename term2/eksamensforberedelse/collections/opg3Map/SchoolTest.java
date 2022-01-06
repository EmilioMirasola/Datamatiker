package term2.eksamensforberedelse.collections.opg3Map;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SchoolTest {
	private School school;
	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;
	private Student student5;

	@BeforeEach
	void setUp() {
		this.school = new School("EAAA");
		student1 = new Student(1, "1");
		student2 = new Student(2, "2");
		student3 = new Student(3, "3");
		student4 = new Student(4, "4");
		student5 = new Student(5, "5");

		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);
	}

	@Test
	@Order(1)
	void test_average_calculation() {
		student1.addGrade(10);
		student2.addGrade(10);
		student3.addGrade(10);
		student4.addGrade(10);
		student5.addGrade(10);

		assertEquals(10, school.calculateAverageGrade());
	}

	@Test
	@Order(2)
	void test_find_student_by_number() {
		assertNotNull(school.findStudent(1));
		assertNull(school.findStudent(100000));
	}


}
