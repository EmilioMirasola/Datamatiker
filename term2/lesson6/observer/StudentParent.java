package term2.lesson6.observer;

import term2.lesson6.strategy.AcademicStudent;

public class StudentParent implements Observer {
	private int numberOfChildren;

	public void raiseNumberOfChildren() {
		numberOfChildren += 1;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	@Override
	public String toString() {
		return "Parent (children: " + numberOfChildren + ")";
	}

	@Override
	public void subjectDied(Observable subject) {
		if (subject instanceof AcademicStudent) {
			numberOfChildren--;
		} else {
			System.out.println("En anden handling for en JungleCannibal");
		}
	}
}
