package by.htp.smth;

import by.htp.pack.PackFactory;
import by.htp.smth.Coffee;

public class Maintest {
	public static void main(String[] args) {
		
		Coffee lavazza = new Coffee(25, "Beans", "Arabica");
		Coffee jacobs = new Coffee(15, "Instant", "Arabica");
		Coffee amato = new Coffee(20, "Grind", "Arabica");
		
		
		PackFactory packFactory = new PackFactory();	
//		Pack test = packFactory.createPack("medium bag", lavazza);
//		int testInt = test.coffeeMassInPack();
//		System.out.println(testInt);

		
		
		Truck truck = new Truck(15000);
		System.out.println("Current load: " + truck.getLoadWeight());
		for (int i = 0; i < 50; i++){
		truck.loadNewPack(packFactory.createPack("medium bag", lavazza));
		}
		System.out.println("Current load: " + truck.getLoadWeight());
//		truck.loadNewPack(packFactory.createPack("Small tin", amato));
//		truck.loadNewPack(packFactory.createPack("smalledium bag", lavazza));
//		truck.loadNewPack(packFactory.createPack("Large Bag", jacobs));
		
	}
		
		

}
