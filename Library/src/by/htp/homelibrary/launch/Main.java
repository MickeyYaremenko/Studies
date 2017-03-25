package by.htp.homelibrary.launch;

import by.htp.homelibrary.domain.Book;
import by.htp.homelibrary.domain.Library;
import by.htp.homelibrary.domain.Magazine;
import by.htp.homelibrary.domain.PrintedEdition;

public class Main {
	public static void main(String[] args) { 
		Library library = new Library(); 
		Book book1 = new Book(15,"The Lie I've Lived", "aa");
		//PrintedEdition pred = new Book(13,"asd","ca");
		Book book = new Book(10,"123", "123");
		String a = "newString";
		
		library.addNewEdition(book1); 
		library.addNewEdition(new Magazine(14, "WSJ","ab"));
		library.addNewEdition(new Book(13, "Stephen King","ba")); 
		library.addNewEdition(new Magazine(12, "Esquire","bb")); 

		library.showLibrary(); 
		System.out.println("Выводим, с авторами/редакторами на а");
		
		library.showALib();
		}
	
	
	
	
}
//почитать про ранне связывание, тип ссылки, тип объекта