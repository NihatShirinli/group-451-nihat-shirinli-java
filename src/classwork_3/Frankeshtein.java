package classwork_3;

public class Frankeshtein extends Monster {
	public Frankeshtein(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}

	public void Walk() {
		boolean walk = true;
	}
	public void run() {
		boolean run = true;
	}
	public void breath() {
		boolean breath = true;
	}
    @Override
    public void attack() {
        System.out.println(name + " бьёт врага");
    }
    @Override
    public void defend() {
        System.out.println(name + " не умирает");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " сшит после смерти");
    }
}