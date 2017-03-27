package by.htp.pack;

import by.htp.smth.Coffee;

public class LargeTin extends Pack{

	private static final int LARGE_VOLUME = 500;
	private static final int PACK_MASS = 125;
	private Coffee coffee;
	
	public LargeTin(Coffee coffee) {
		super(LARGE_VOLUME, PACK_MASS, coffee);
	}

	@Override
	public int coffeeMassInPack() {
		int coffeeMass = 0;
		if (coffee.getState().equalsIgnoreCase("beans")) {
			coffeeMass = (int) VOLUME_TO_MASS_COEFF_BEANS * LARGE_VOLUME;
		} else if (coffee.getState().equalsIgnoreCase("grind")) {
			coffeeMass = (int) VOLUME_TO_MASS_COEFF_GRIND * LARGE_VOLUME;
		} else if (coffee.getState().equalsIgnoreCase("instant")) {
			coffeeMass = (int) VOLUME_TO_MASS_COEFF_INSTANT * LARGE_VOLUME;
		}
		return coffeeMass;
	}

	@Override
	public int packPrice() {
		int packPrice = coffeeMassInPack() * coffee.getGramPrice();
		return packPrice;
	}
	
	@Override
	public int summaryMass() {
		int summaryMass = PACK_MASS + coffeeMassInPack();
		return summaryMass;
	}

}
