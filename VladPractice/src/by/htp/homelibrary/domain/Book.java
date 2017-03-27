package by.htp.homelibrary.domain;

public class Book extends PrintedEdition{
	String author;
	public Book(double price, String name, String au) { 
		super(price, name); 
		author = au;
	}
	/*public Book(double price, String title, String author){
		//super(price, title);
		this(price, name, author);
	}*/

		
	public String toString() { 
		return "Book {price = " + super.price +", name = '" + super.name + ", author = '" + this.author + "'}";
	}
	public String printFormat(){
		return "A5";
	}
	
	public  boolean showAPrintedEdition(){
		boolean a = author.startsWith("a");
		return a; 
		}
		
	}

/* написать сортировку не пузырьком
 * первый клас в каечстве поля содержит массив, второй мэйн, ввод с клавиатуры; пакет для мэйн, пакет для остального
 * */
