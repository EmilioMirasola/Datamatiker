package term2.lesson6.observer;

public interface Observable {
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver();
}
