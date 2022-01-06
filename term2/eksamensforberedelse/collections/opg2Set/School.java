package term2.eksamensforberedelse.collections.opg2Set;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class School {
	private String name;
	private Set<Student> students;

	public School(String name) {
		this.name = name;
		this.students = new HashSet<>();
	}

	public Student findStudent(int studentNumber) {
		for (Student student : students) {
			if (student.getStudentNumber() == studentNumber) {
				return student;
			}
		}
		return null;
	}

	public double calculateAverageGrade() {
		int sum = 0;
		for (Student student : students) {
			for (int grade : student.getGrades()) {
				sum += grade;
			}
		}
		return (double) sum / students.size();
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
}
