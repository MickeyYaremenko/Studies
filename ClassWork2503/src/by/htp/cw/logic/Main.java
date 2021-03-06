package by.htp.cw.logic;

import java.io.InputStreamReader;
import java.util.Scanner;

import by.htp.cw.entity.Product;
import by.htp.cw.entity.Store;

public class Main {
	public static void main (String[] args){
		Store store = new Store();
		Product vegetable = new Product(12, "Potato", "15489", "Garden Inc", 15.0, 7);
		Product cake = new Product(11, "Honey Cake", "15647", "Bakery Inc", 45.5, 2);
		Product scissors = new Product(859, "Best scissors ever", "1649749", "Iron goods", 26.7, 2000);
		Product anotherScissors = new Product(857, "Usual Scissors", "16549", "Iron goods", 18.2, 1500);
		
		store.addProduct(vegetable);
		store.addProduct(cake);
		store.addProduct(scissors);
		store.addProduct(anotherScissors);
		
		
		store.showStoreName();
		store.showStoreNamePrice();
		store.showStoreLongevityDays();
		
	}

}
