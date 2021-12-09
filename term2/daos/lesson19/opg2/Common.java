package term2.daos.lesson19.opg2;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Semaphore;

@Getter
@Setter
public class Common {
	private int next;
	private int current;
	private final Semaphore chefSmaphore = new Semaphore(0);
	private final Semaphore waiterSemaphore = new Semaphore(1);

	public void addOrder() {
		try {
			waiterSemaphore.acquire();
			this.next++;
			System.out.println("Tjener tilføjer ordre: " + next);
			waiterSemaphore.release();
			chefSmaphore.release();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makeOrder() {
		try {
			chefSmaphore.acquire();
			current++;
			System.out.println("Kok laver ordre: " + current);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
