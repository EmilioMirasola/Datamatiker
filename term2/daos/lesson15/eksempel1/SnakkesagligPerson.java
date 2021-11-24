package term2.daos.lesson15.eksempel1;

public class SnakkesagligPerson extends Thread {

	private String navn;
	private int ventetid;

	public SnakkesagligPerson(String navn, int ventetid) {
		this.navn = navn;
		this.ventetid = ventetid;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(navn + ": bla bla bla " + i);
			try {
				Thread.sleep(ventetid);
			} catch (Exception e) {
			} // vent lidt
		}
	}
}