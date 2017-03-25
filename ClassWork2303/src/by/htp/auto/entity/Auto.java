package by.htp.auto.entity;

public class Auto extends Transport {
	private int passangers;
	private static int autoCount;
//	private static int counterAuto;
	

	{
		passangers = 4;
	}

	{
		autoCount++;
	}

	
	public Auto() {
		super();
	}

	public Auto(double mass, double race, int passangers) {
		super(mass, race);
		this.passangers = passangers;
	}

	

	public static int getAutoCount() {
		return autoCount;
	}

	public static void setAutoCount(int autoCount) {
		Auto.autoCount = autoCount;
	}
	

}
