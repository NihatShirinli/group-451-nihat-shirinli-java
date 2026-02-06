package classwork_3;

public class Zombie extends Monster {

	public Zombie(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}
	public void Walk() {
		String walk = "Can walk";
	}
	public void sleep() {
		String cantSleep = "Can't sleep";
	}
	public void bite() {
		String bite = "Can jumbitep";
	}
    @Override
    public void attack() {
        System.out.println(name + " кусает врага и тот превращается в зомби");
    }
    @Override
    public void defend() {
        System.out.println(name + " съест твой мозг");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " Не выносят солнце");
    }

}
