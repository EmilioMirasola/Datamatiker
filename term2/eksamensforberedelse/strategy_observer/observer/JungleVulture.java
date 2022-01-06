package term2.eksamensforberedelse.strategy_observer.observer;

public class JungleVulture implements AcademicStudentObserver{
	private int numberOfMeals;

	public JungleVulture() {
		this.numberOfMeals = 0;
	}

	public int getNumberOfMeals() {
		return numberOfMeals;
	}

	@Override
	public void notifySubjectDied() {
		numberOfMeals++;
	}
}
