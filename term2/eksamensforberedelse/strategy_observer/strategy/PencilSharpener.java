package term2.eksamensforberedelse.strategy_observer.strategy;

public class PencilSharpener implements Weapon {
	public int cuttingDamage;

	public PencilSharpener() {
		this.cuttingDamage = 1;
	}

	public int getCuttingDamage() {
		return cuttingDamage;
	}

	public void dealDamage(JungleCannibal enemy) throws JungleCannibalException {
		enemy.dealDamage(cuttingDamage);
	}
}
