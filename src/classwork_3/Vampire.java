package classwork_3;

public class Vampire extends Monster {

	public Vampire(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}
	public void Walk() {
		String looksLikeAPersonButIsnt = "Have long 2 teeth";
	}
	public void stayUnderSun() {
		boolean cantStayUnderSun = false;
	}
	public void canBite() {
		boolean canBite = true;
	}
	
    @Override
    public void attack() {
        System.out.println(name + " кусает врага и пьёт кровь");
    }
    @Override
    public void defend() {
        System.out.println(name + " быстро бегает");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " Не выносят серебро");
    }

}
