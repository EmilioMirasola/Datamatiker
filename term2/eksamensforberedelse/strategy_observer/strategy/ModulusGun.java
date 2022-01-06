package term2.eksamensforberedelse.strategy_observer.strategy;

public class ModulusGun implements Weapon {
	private final int damage;

	public ModulusGun() {
		this.damage = 20;
	}

	@Override
	public void dealDamage(JungleCannibal cannibal) throws JungleCannibalException {
		cannibal.dealDamage(damage);
	}
}
