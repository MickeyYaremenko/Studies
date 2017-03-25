package by.htp.library;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(15.3);
		book.setTitle("First Book");
		
		Book book2 = new Book(18.6, "Second book");
		System.out.println("Book1: price= " + book.getPrice()
		+ " " + "title= " + book.getTitle());
		
		System.out.println("Book2: price= " + book2.getPrice()
		+ " " + "title= " + book2.getTitle());
		
		
		
		
		Magazine magazine = new Magazine();
		magazine.setPrice(10);
		magazine.setTitle("Cool magazine");
		
		PrintedEdition printedEdition = new Book();
		Object obj = new Book();
		//Book book = new PrintedEdition();
		
		PrintedEdition prints[];
		
		
		//System.out.println
	 
	 /*Дописать эту задачу таким образом, чтобы у нас появился класс библиотека, 
	  * в котором в качестве поля объявить массив печатных ихданий, написать метод добавления нового печатного издания, 
	  * метод вывода всех печатных изданий на экран, количество печатных изданий неограничено 
	  * (организовать простой список на основе массива)
	  */

	}

}

