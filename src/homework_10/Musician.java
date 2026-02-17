package homework_10;

	abstract class Musician {
	    protected String name;
	    protected int experienceYears;

	    public Musician(String name, int experienceYears) {
	        this.name = name;
	        this.experienceYears = experienceYears;
	    }

	    public abstract void playInstrument();
	}
