package by.htp.auto.logic;

public class AutoCountant extends Accountant{
	private static final int KOEFF_AMORTIZATION = 10;
	
	@Override
	public double amortisate(int years) {
		double result = (totalRace() * years * KOEFF_AMORTIZATION) / PERCENTAGE;
		return result;
	}

	@Override
	public double amortisate() {
		// TODO Auto-generated method stub
		return 0;
	}
}
