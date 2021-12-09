package term2.daos.lesson19.opg3;

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
		notify();
	}

	public synchronized void makeOrder() {
		try {
			if (next <= current) {
				System.out.println("Kok venter");
				wait();
			} else {
				current++;
				System.out.println("Kok laver ordre: " + current);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
