package classwork_5;

public class Hero {
	String name = "Supername";
	int health = 100;
	int strength = 500;
	int level = 10;
	
	public Hero(String name, int health, int strength, int level) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.level = level;
	}
	
	public void attack() {
		System.out.println("Hero attacks with: " + strength + " strength");
	}
	public void takeDamage(int damage) {
		health -= damage;
	}
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
	}
}
