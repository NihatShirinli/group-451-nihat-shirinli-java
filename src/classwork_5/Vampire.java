package classwork_5;

public class Vampire extends Monster {
	public Vampire(String type, int health, int damage) {
		super(type, health, damage);
	}
	
	public void specialAbility() {
		System.out.println("Drink blood");
	}
}
