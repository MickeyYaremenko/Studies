package by.htp.auto.entity;

public abstract class Transport {
	private double mass;
	private static String producer;
	private double race;
	
	{
		mass = 1.0;
		
	}

	static {
		producer = "Beltelecom";
	}

	public Transport() {
	}

	public Transport(double mass, double race) {
		this.mass = mass;
		this.race = race;
	}

	public double totalRace() {
		return race;
	}

	public void move(double distance) {
		race += distance;
	}

	

	public double getRace() {
		return race;
	}

	public void setRace(double race) {
		this.race = race;
	}

}
