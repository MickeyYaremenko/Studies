package by.htp.launcher;

import java.util.ArrayList;

import by.htp.consolelibrary.Book;
import by.htp.consolelibrary.Console;
import by.htp.consolelibrary.Library;

public class Launcher {

	public static void main(String[] args) {
		ArrayList<Book> arrayOfBooks = new ArrayList<>();
		Book book1 = new Book("Potter", "Rowling", 1995);
		Book book2 = new Book("MOWGLY", "KIPLING", 1990);
		Book book3 = new Book("LionKing", "Dont remember", 1985);
		Book book4 = new Book("StarWars", "Lucas", 2003);
		Book book5 = new Book("TMNT", "Nickelodeon", 1800);
		
		arrayOfBooks.add(book1);
		arrayOfBooks.add(book2);
		arrayOfBooks.add(book3);
		arrayOfBooks.add(book4);
		arrayOfBooks.add(book5);
		
		Library lib = new Library(arrayOfBooks);
//		lib.printLib();
//		lib.sortLibi(); 
//		System.out.println("отсортировано");
//		lib.printLib();
		
		Console console = new Console(lib);
		console.launch();

	}

}
