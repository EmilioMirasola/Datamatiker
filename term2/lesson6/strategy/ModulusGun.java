package term2.lesson6.strategy;

public class ModulusGun implements WeaponActions {
	private final int damage;

	public ModulusGun() {
		this.damage = 5;
	}

	@Override
	public void dealDamage(JungleCannibal enemy) throws JungleCannibalException {
		enemy.dealDamage(damage);
	}
}
