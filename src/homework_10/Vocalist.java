package homework_10;

public class Vocalist extends Musician {

	public Vocalist(String name, int experienceYears) {
		super(name, experienceYears);
		}
	
	
    @Override
    public void playInstrument() {
        System.out.println(name + " поет невероятный вокал как говорится Gen Z");
    
}
