package by.htp.persons;

import java.util.ArrayList;

public class Conference {
	private ArrayList<Person> persons = new ArrayList<>();

	public void setPersons(ArrayList<Person> person) {
		this.persons = person;

	}

	public ArrayList<Person> getPersons() {
		return persons;

	}
	
	public void printPersons (){
		System.out.println("Persons:");
		for (int i = 0; i < persons.size(); i++){
			System.out.println(persons.get(i));
		}
	}
			
}
