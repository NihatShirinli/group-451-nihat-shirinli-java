package classwork_5;

public class Dragon extends Monster {

	public Dragon(String type, int health, int damage) {
		super(type, health, damage);
	}
	
	public void speacialAbility() {
		System.out.println("Dragon breath");
	}
}
