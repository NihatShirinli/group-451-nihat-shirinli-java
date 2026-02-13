package classwork_5;

public class Monster {
	String type = "Vamprire";
	int health = 100;
	int damage = 250;
	
	public Monster(String type, int health, int damage) {
		this.type = type;
		this.health = health;
		this.damage = damage;
	}
	
	public void attack() {
		health -= damage;
	}
	public void roar() {
		System.out.println("AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUEEEEEEEEEEEEEEEEEEEEEE");
	}
}
