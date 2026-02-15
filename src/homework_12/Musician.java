package homework_12;

	public abstract class Musician {
	    public String name;
	    public int experienceYears;

	    public Musician(String name, int experienceYears) {
	        this.name = name;
	        this.experienceYears = experienceYears;
	    }

	    public abstract void playInstrument();
	}
