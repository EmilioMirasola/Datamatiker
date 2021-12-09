package term2.daos.lesson19.opg1;

import lombok.Getter;

@Getter
public class Common {
	private int next;
	private int current;

	public Common() {
	}

	public void addOrder() {
		this.next++;
		System.out.println("Tjener tilføjer ordre: " + next);
	}

	public void makeOrder() {
		try {
			if (next <= current) {
				System.out.println("Kok venter");
			} else {
				current++;
				System.out.println("Kok laver ordre: " + current);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
