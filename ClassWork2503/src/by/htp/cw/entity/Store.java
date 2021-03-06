package by.htp.cw.entity;

import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.Scanner;

public class Store {

	private Product[] store = new Product[0];

	public void addProduct(Product product) {
		if (Product.getProducedAmount() >= store.length) {
			Product[] newStore = new Product[store.length + 15];
			for (int i = 0; i < store.length; i++) {
				newStore[i] = store[i];
			}
			newStore[store.length] = product;
			store = newStore;
		} 
		else {
			store[Product.getProducedAmount()-1] = product;
		}
//		store = Arrays.copyOf(store, store.length + 1);
//		store[store.length - 1] = product;
	}

	public void showStoreName() {
		System.out.println("������� ������������ ������");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String name = sc.nextLine();
		for (int i = 0; i < store.length; i++) {
			if (store[i].getName().toLowerCase().contains(name.toLowerCase()))
				System.out.println(store[i]);
		}
	}

	public void showStoreNamePrice() {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("������� ������������ ������");
		String name = sc.nextLine();
		System.out.println("������� ���� ������������ ����");
		double price = sc.nextDouble();
		for (int i = 0; i < store.length; i++) {
			if (store[i].getName().toLowerCase().contains(name.toLowerCase()) && store[i].getPrice() < price)
				System.out.println(store[i]);
		}
	}

	public void showStoreLongevityDays() {
		System.out.println("������� ����������� ���� ��������");
		for (int i = 0; i < store.length; i++) {
			Scanner sc = new Scanner(new InputStreamReader(System.in));
			int days = sc.nextInt();
			if (store[i].getLongevityDays() > days)
				System.out.println(store[i]);
		}
	}

}
