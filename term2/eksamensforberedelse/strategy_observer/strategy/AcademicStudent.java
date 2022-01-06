package term2.eksamensforberedelse.strategy_observer.strategy;


import lombok.Getter;
import term2.eksamensforberedelse.strategy_observer.observer.AcademicStudentObservable;
import term2.eksamensforberedelse.strategy_observer.observer.AcademicStudentObserver;
import term2.eksamensforberedelse.strategy_observer.observer.StudentParent;

import java.util.ArrayList;
import java.util.List;

public class AcademicStudent implements AcademicStudentObservable {
	private final String name;
	private int health;
	private StudentParent parent;
	private final List<AcademicStudentObserver> observers;

	@Getter
	private Weapon weapon;

	public AcademicStudent(String name, int health) {
		this.name = name;
		this.health = health;
		this.observers = new ArrayList<>();
	}

	public int getHealth() {
		return health;
	}

	public void bite(int healthDamage) throws AcademicStudentException {
		this.health -= healthDamage;

		if (health <= 0) {
			onDeath();
		}
	}

	public void setParent(StudentParent parent) {
		this.parent = parent;

		parent.raiseNumberOfChildren();
	}

	public StudentParent getParent() {
		return parent;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void useWeapon(JungleCannibal enemy) throws JungleCannibalException {
		weapon.dealDamage(enemy);
	}

	public void addObserver(AcademicStudentObserver observer) {
		this.observers.add(observer);
	}

	public void removeObserver(AcademicStudentObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public String toString() {
		return name + " (health: " + health + ")";
	}

	@Override
	public void onDeath() {
		for (AcademicStudentObserver observer : this.observers) {
			observer.notifySubjectDied();
		}
	}
}
