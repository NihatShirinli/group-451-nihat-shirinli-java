package classwork_3;

public class Dragon extends Monster {

	public Dragon(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
	}
	public void fly() {
		boolean fly = true;
	}
	public void fireBreath() {
		boolean fireBreath = true;
	}
	public void run() {
		boolean run = false;
	}
    @Override
    public void attack() {
        System.out.println(name + " пылает врага жарой");
    }
    @Override
    public void defend() {
        System.out.println(name + " летает");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " может пылать огнём");
    }
}
