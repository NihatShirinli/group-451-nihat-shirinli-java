package classwork_5;

public class Witch extends Monster {
	public Witch(String type, int health, int damage) {
		super(type, health, damage);
	}
	
	public void specialAbility() {
		System.out.println("Can throw a lot of potions");
	}
}
