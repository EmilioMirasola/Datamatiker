package term2.lesson6.strategy;

public class LethalVirus implements WeaponActions {
	private final int damage;

	public LethalVirus() {
		this.damage = 10;
	}

	@Override
	public void dealDamage(JungleCannibal enemy) throws JungleCannibalException {
		enemy.dealDamage(damage);
	}
}
