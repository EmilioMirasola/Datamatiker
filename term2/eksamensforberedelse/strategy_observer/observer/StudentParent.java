package term2.eksamensforberedelse.strategy_observer.observer;

public class StudentParent implements AcademicStudentObserver {
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
	public void notifySubjectDied() {
		this.numberOfChildren--;
	}
}
