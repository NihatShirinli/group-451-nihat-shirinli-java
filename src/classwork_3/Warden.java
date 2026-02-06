package classwork_3;

public class Warden extends Monster {

	public Warden(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}
	public void Strong() {
		boolean veryStrong = true;
	}
	
	public void livesInDark() {
		boolean livesInDark = true;
	}
	public void likesKilling() {
		boolean likesKilling = true;
	}
    @Override
    public void attack() {
        System.out.println(name + " отталкивает врага на большую дистанцию с большим уроном");
    }
    @Override
    public void defend() {
        System.out.println(name + " прячется в подземельях");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " не выносят звук");
    }
}
