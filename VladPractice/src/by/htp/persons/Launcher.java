package by.htp.persons;

import java.util.ArrayList;


public class Launcher {

	public static void main(String[] args) {
		Adress ad1 = new Adress("Minsk", "Vesennjaja", 14);
		// Person p1 = new Person(24,"Mike",ad1);
		// System.out.println(p1);
		Person p1 = new Student(24, "Jake", ad1, "BNTU");
		Person p2 = new Worker(25, "Mel", ad1, "Sales");

		p1.cry();
		p2.cry();

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);

		Conference conf1 = new Conference();
		conf1.printPersons();
		conf1.setPersons(persons);
		conf1.printPersons();
		

	}

}
