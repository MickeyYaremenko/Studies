package by.htp.auto.entity;

public class Train extends Transport {
	private int wagon;
	private static int counterRailways;
	private static int trainsCounter;
	

	{
		wagon = 10;
	}
	{
		trainsCounter++;
	}
	
	public Train() {
		super();
	}

	public Train(double mass, double race, int wagon) {
		super(mass, race);
		this.wagon = wagon;
	}

	

	public static int getTrainsCounter() {
		return trainsCounter;
	}

	public static void setTrainsCounter(int trainsCounter) {
		Train.trainsCounter = trainsCounter;
	}
	

}
