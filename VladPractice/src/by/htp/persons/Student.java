package by.htp.persons;

public class Student extends Person {
	private String colName;
	
	public Student(int age, String name, Adress adress, String colName){
		super(age, name, adress);
		this.colName = colName;
	}
	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	@Override
	public void cry() {
		System.out.println("I'm poor student.");
	}
	
	public void exam(){
		System.out.println("I HATE EXAMS");
	}

}
