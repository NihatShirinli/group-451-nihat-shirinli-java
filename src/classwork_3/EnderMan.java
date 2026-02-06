package classwork_3;

public class EnderMan extends Monster {
	public EnderMan(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}

	public void teleport() {
		boolean teleport = true;
	}
	public void walk() {
		boolean walk = true;
	}
	public void hold() {
		boolean hold = true;
	}
    @Override
    public void attack() {
        System.out.println(name + " бьёт врага телепортируясь");
    }
    @Override
    public void defend() {
        System.out.println(name + " телепортируется");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " не терпят когда им смотрят в глаза");
    }
}
