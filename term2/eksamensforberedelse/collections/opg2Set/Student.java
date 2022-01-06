package term2.eksamensforberedelse.collections.opg2Set;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student implements Comparable<Student> {
	private int studentNumber;
	private String name;
	private List<Integer> grades;

	public Student(int studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.grades = new ArrayList<>();
	}


	public void addGrade(int grade) {
		this.grades.add(grade);
	}

	@Override
	public int compareTo(@NotNull Student o) {
		return studentNumber - o.getStudentNumber();
	}

	@Override
	public String toString() {
		return getName();
	}

}
