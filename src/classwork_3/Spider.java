package classwork_3;

public class Spider extends Monster {
	public Spider(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}

	public void Climb() {
		boolean canClimb = true;
	}
	public void canBite() {
		boolean canBite = true;
	}
	public void canRun() {
		boolean canRun = true;
	}
    @Override
    public void attack() {
        System.out.println(name + " кусает врага");
    }
    @Override
    public void defend() {
        System.out.println(name + " может залезать куда угодно");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " Не выносят людей");
    }

}
