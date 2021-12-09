package term2.daos.lesson19.opg4;

import lombok.Getter;

@Getter
public class Common {
	private int next;
	private int current;

	public Common() {
	}

	public synchronized void addOrder() {
		this.next++;
		System.out.println("Tjener tilføjer ordre: " + next);
		notifyAll();
	}

	public synchronized void makeOrder(int chefNumber) {
		try {
			if (next <= current) {
				System.out.println("Kok " + chefNumber + " venter");
				wait();
			} else {
				current++;
				System.out.println("Kok " + chefNumber + " laver ordre: " + current);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
