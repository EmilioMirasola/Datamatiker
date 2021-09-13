package term2.lesson6.strategy;

import term2.lesson6.observer.Observer;
import term2.lesson6.observer.StudentParent;
import term2.lesson6.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class AcademicStudent implements Observable {
	private String name;
	private int health;
	private StudentParent parent;
	private WeaponActions weaponActions;
	private List<Observer> observers = new ArrayList<>();

	public AcademicStudent(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void bite(int healthDamage) throws AcademicStudentException {
		if (health > 0) {
			this.health -= healthDamage;
			if (health <= 0) {
				this.notifyObserver();
			}
		} else {
			throw new AcademicStudentException("The student named " + name + " does no longer exist");
		}
	}


	public void addObserver(Observer observable) {
		this.observers.add(observable);
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

	public void setParent(StudentParent parent) {
		this.parent = parent;

		parent.raiseNumberOfChildren();
	}

	public StudentParent getParent() {
		return parent;
	}

	public void setWeapon(WeaponActions weapon) {
		this.weaponActions = weapon;
	}

	public void useWeapon(JungleCannibal enemy) throws JungleCannibalException {
		weaponActions.dealDamage(enemy);
	}

	@Override
	public String toString() {
		return name + " (health: " + health + ")";
	}
}
