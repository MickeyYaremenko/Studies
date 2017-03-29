package by.htp.homelibrary.domain;

import java.util.Arrays;

public class Library {
	PrintedEdition[] editions = new PrintedEdition[0]; 

	public Library(){} 

	public void addNewEdition(PrintedEdition edition){ 
		editions = Arrays.copyOf(editions, editions.length+1); 
		editions[editions.length - 1] = edition; 
	}

	public void showLibrary(){ 
		for (int i = 0; i < editions.length; i++){
			System.out.println(editions[i].toString()); 
		}
	}
	
	public void showALib(){ 
		for (int i = 0; i < editions.length; i++){
			if (editions[i].showAPrintedEdition())
			System.out.println(editions[i]); 
			}
		}
}
	

/* книге добавить поле автор, а журналу поле редактор
 * напистаь метод, окторый выводит из массива все печатные издания, имя редактора/автора которых начинается на а 
 * с применением переопределения метода
 * */
