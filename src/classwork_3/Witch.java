package classwork_3;

public class Witch extends Monster {

	public Witch(String name, int health, double attackStrength, boolean canfly, int enduranceLvl, int speedLvl,
			int magicLvl) {
		super(name, health, attackStrength, canfly, enduranceLvl, speedLvl, magicLvl);
		}
	public void Poison() {
	String poison = "Have lots of em";	
	}
	public void Ugly() {
		String howUglyLook = "TOO UGLY";
	}
	public void howDangerous() {
		String verySmart = "She's or he's very smart";
	}
	
    @Override
    public void attack() {
        System.out.println(name + " кидает на врага яд");
    }
    @Override
    public void defend() {
        System.out.println(name + " кидает на врага зелья медленности");
    }
    @Override
    public void useSpecial() {
        System.out.println(name + " имеет зелья с ядом");
    }
}
