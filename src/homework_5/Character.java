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
    
    Character health(int value) {
    	health += value;
    	return this;
    }
    
    Character train() {
    	strength += 5e21;
    	return this;
    }
    
    void printStats() {
    	System.out.println("Name: " + name);
    	System.out.println("Health: " + health);
    	System.out.println("Strength: " + strength);
    }
}
