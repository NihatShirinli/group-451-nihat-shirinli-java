package homework_10;

public class Bird extends Animal {

	public Bird(String name, int age, String sound) {
		super(name, age, sound);
		}
	
	public void makeSound() {
		System.out.println("Чик-чирик");
	}
}
