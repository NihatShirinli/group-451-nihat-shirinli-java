package classwork_3;

public class Creeper extends Monster {

	public Creeper(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
	}
	public void explode() {
		boolean explode = true;
	}
	public void run() {
		boolean run = true;
	}
	public void walk() {
		boolean walk = true;
	}
    @Override
    public void attack() {
        System.out.println(name + " убивает врага с самим собой");
    }
    @Override
    public void defend() {
        System.out.println(name + " может взорваться если человек близок");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " взрывается");
    }
}
