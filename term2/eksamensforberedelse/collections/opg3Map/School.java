package term2.eksamensforberedelse.collections.opg3Map;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class School {
	private String name;
	private Map<Integer, Student> students;

	public School(String name) {
		this.name = name;
		this.students = new HashMap<>();
	}

	public Student findStudent(int studentNumber) {
		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			Student student = entry.getValue();

			if (student.getStudentNumber() == studentNumber) {
				return student;
			}
		}
		return null;
	}

	public double calculateAverageGrade() {
		int sum = 0;
		for (Map.Entry<Integer, Student> entry : students.entrySet()) {
			Student student = entry.getValue();
			for (int grade : student.getGrades()) {
				sum += grade;
			}
		}
		return (double) sum / students.size();
	}

	public void addStudent(Student student) {
		this.students.put(student.getStudentNumber(), student);
	}
}
