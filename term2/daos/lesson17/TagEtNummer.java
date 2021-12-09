package term2.daos.lesson17;

public class TagEtNummer {

	private int naeste = 0;
	private int betjening = 0;

	public synchronized void naesteNummer(int kundeId) {
		naeste = naeste + 1;
		System.out.println("Kunde " + kundeId + " tager nummer " + naeste);
		notify();
	}

	public synchronized void naesteKunde() {
		try {
			if (naeste <= betjening) {
				System.out.println("  Ekspedient venter ");
				wait();
			} else {
				++betjening;
				System.out.println("  Ekspedient ekspederer nummer " + betjening);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
}
