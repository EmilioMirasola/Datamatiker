package term2.eksamensforberedelse.strategy_observer.strategy;

public class LethalVirus implements Weapon {
	private final int damage;

	public LethalVirus() {
		this.damage = 10;
	}

	@Override
	public void dealDamage(JungleCannibal cannibal) throws JungleCannibalException {
		cannibal.dealDamage(damage);
	}
}
