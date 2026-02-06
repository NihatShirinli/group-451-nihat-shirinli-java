package classwork_3;

public class Golem extends Monster {

	public Golem(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}
	public void madeOfSteel() {
		boolean madeOfSteel = true;
	}
	public void canBeDestroyed() {
		boolean canBeDestroyed = true;
	}
	public void immortal() {
		boolean immortal = false;
	}
    @Override
    public void attack() {
        System.out.println(name + " бьёт врага как сумасшедший");
    }
    @Override
    public void defend() {
        System.out.println(name + " отталкивает врага");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " постепенно их железо разрушается");
    }
}
