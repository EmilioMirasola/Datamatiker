package term2.eksamensforberedelse.simpelSortering;

public class Customer implements Comparable<Customer> {
	private int alder;
	private String fornavn;
	private String efternavn;

	public Customer(int alder, String fornavn, String efternavn) {
		super();
		this.alder = alder;
		this.fornavn = fornavn;
		this.efternavn = efternavn;
	}

	public int getAlder() {
		return alder;
	}

	public void setAlder(int alder) {
		this.alder = alder;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEfternavn() {
		return efternavn;
	}

	public void setEfternavn(String efternavn) {
		this.efternavn = efternavn;
	}

	@Override
	public int compareTo(Customer customer) {
		int compare = efternavn.compareTo(customer.efternavn);
		if (compare == 0) {
			compare = fornavn.compareTo(customer.fornavn);
			if (compare == 0) {
				compare = alder - customer.alder;
			}
		}
		return compare;
	}

	@Override
	public String toString() {
		return "Customer [alder=" + alder + ", fornavn=" + fornavn + ", efternavn=" + efternavn + "]";
	}

}
