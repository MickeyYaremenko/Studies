package by.htp.consolelibrary;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
	private ArrayList<Book> lib = new ArrayList<>();

	public Library(ArrayList<Book> lib) {
		this.lib = lib;
	}

	public ArrayList<Book> getLib() {
		return lib;
	}

	public void setLib(ArrayList<Book> lib) {
		this.lib = lib;
	}

	public ArrayList<Book> searchByAuthor(String author) {
		ArrayList<Book> libauth = new ArrayList<>();
		for (Book b : lib) {
			if (b.getAuthor().equals(author)) {
				libauth.add(b);
			}
		}
		return libauth;

	}

	public void addBook(Book b) {
		lib.add(b);
	}

	public void deleteBook(String title) {
		for (int i = 0; i < lib.size(); i++) {
			if (lib.get(i).getTitle().equals(title)) {
				lib.remove(i);
				break;
			}
		}
	}

	public void sortLib() { // красивый вариант с использованием "звонка другу"
		Collections.sort(lib, new BookComparator());
	}

	public void sortLibi() { // некрасивый самостоятельный вариант, но тоже
								// рабочий
		for (int j = 0; j < lib.size(); j++) {
			for (int i = 0; i < lib.size() - 1; i++) {
				int q = lib.get(i).getYear();
				int w = lib.get(i + 1).getYear();
				if (q > w) {
					Book temp = lib.get(i);
					lib.set(i, lib.get(i + 1));
					lib.set(i + 1, temp);
				}
			}
		}
	}

	public void printLib() {
		for (Book b : lib) {
			System.out.println(b);
		}
	}

}
