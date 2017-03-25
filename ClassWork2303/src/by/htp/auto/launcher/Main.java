package by.htp.auto.launcher;

import by.htp.auto.entity.Auto;
import by.htp.auto.entity.Train;
import by.htp.auto.entity.Transport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport auto1 = new Auto(10, 10, 4);
		Transport auto2 = new Auto(10, 10, 4);
		Transport auto3 = new Auto();
		Transport auto4 = new Auto();
		Transport train1 = new Train(10, 10, 4);
		Transport train2 = new Train(10, 10, 4);
		Transport train3 = new Train(10, 10, 4);
		Transport train4 = new Train(10, 10, 4);

		System.out.println("Total auto count: " + Auto.getAutoCount());
		System.out.println("Total trains count: " + Train.getTrainsCounter());
		System.out.println("Auto2 wear rate: " + auto2.amortisate(8));
		System.out.println("Train2 wear rate: " + train2.amortisate(8));
	}

}
