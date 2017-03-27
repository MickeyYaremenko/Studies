package by.htp.persons;

public abstract class Person {

	private int age;
	private String name;
	private Adress adress;
	
	public Person(){}

	public Person(int age, String name, Adress adress) {
		this.age = age;
		this.name = name;
		this.adress = adress;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Adress getAdress() {
		return this.adress;
	}

	public String toString() {
		return "Name: " + this.name + " Age: " + this.age + " Adress: " + this.adress;
	}
	
	public abstract void cry();

}
