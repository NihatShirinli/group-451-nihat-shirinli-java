package homework_5;

public class Character {
    String name;
    int health;
    int strength;
    
    Character(String name, int health, int strength){
    	this.name = name;
    	this.health = health;
    	this.strength = strength;
    }
    
    Character train(int healthybro) {
    	health += healthybro;
    	return new Character(name, health, strength);
    }
    
    Character train() {
    	strength += 5;
    	return new Character(name, health, strength);
    }
    
    void printStats() {
    	System.out.println("Name: " + name);
    	System.out.println("Health: " + health);
    	System.out.println("Strength: " + strength);
    }
}
