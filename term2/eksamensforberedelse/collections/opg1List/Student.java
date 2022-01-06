package term2.eksamensforberedelse.collections.opg1List;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {
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
}
