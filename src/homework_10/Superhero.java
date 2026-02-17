package homework_10;

public class Superhero {
	static String name = "Superman";
	static int powerLevel = 10;
	String secretIdentity = "Superwoman";
	
	public Superhero(String name, int powerlevel, String secretIdentity) {
		this.name = name;
		this.powerLevel = powerLevel;
		this.secretIdentity = secretIdentity;
	}
	public void showHeroCard() {
		System.out.println("Name of the super hero: " + name + " PowerlLevel of super hero: " + powerLevel + " Secret Identity of Super Hero: " + secretIdentity);
	}
	
	public static void main(String[] args) {
		System.out.println("Супергерой " + name + "использует силу уровня " + powerLevel + " !");
	}
}
