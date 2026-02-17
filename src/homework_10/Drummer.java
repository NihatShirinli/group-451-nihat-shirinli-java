package homework_10;

public class Drummer extends Musician {

	public Drummer(String name, int experienceYears) {
		super(name, experienceYears);
		}
	
    @Override
    public void playInstrument() {
        System.out.println(name + " играет бешено на барабанах");
    }
}
