package term2.lesson6.observer;

public class JungleVulture implements Observer {
	private int numberOfMeals;

	public JungleVulture() {
		this.numberOfMeals = 0;
	}

	public int getNumberOfMeals() {
		return numberOfMeals;
	}

	@Override
	public void subjectDied(Observable s) {
		this.numberOfMeals++;
	}
}
