package term2.lesson6.strategy;

import term2.lesson6.observer.Observer;
import term2.lesson6.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class JungleCannibal implements Observable {
	private int health;
	private List<Observer> observers = new ArrayList<>();

	public JungleCannibal(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void dealDamage(int healthDamage) throws JungleCannibalException {
		if (health > 0) {
			this.health -= healthDamage;
			if (this.health <= 0) {
				this.notifyObserver();
			}
		} else {
			throw new JungleCannibalException("This cannibal is dead");
		}
	}

	public void biteStudent(AcademicStudent academicStudent) throws AcademicStudentException, JungleCannibalException {
		if (health >= 0) {
			academicStudent.bite(5);
		} else {
			throw new JungleCannibalException("This cannibal is dead");
		}
	}


	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.subjectDied(this);
		}
	}
}
