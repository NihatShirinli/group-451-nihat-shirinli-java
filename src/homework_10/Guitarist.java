package homework_10;

public class Guitarist extends Musician {

	public Guitarist(String name, int experienceYears) {
		super(name, experienceYears);
		}
	
    @Override
    public void playInstrument() {
        System.out.println(name + " выдает мощно на гитаре");
    }
}
