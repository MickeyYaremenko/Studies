package by.htp.consolelibrary;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {
	private Library library;
	private final String optionOne = "1. Show all books presented in the library";
	private final String optionTwo = "2. Sort our library by year of publishment and show it";
	private final String optionThree = "3. Search the book with defined author";
	private final String optionFour = "4. Add new book";
	private final String optionFive = "5. Remove book by title";
	private final String exit = "0. Exit our library.";

	public Console(Library library) {
		this.library = library;
	}

	public void launch() {
		System.out.println("Welcome to our Library! Choose one of the options: \n" + optionOne + "\n" + optionTwo + "\n"
				+ optionThree + "\n" + optionFour + "\n" + optionFive + "\n\n\n" + exit + "\n" + "Input your choice: ");
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		while (true) {
			int i = sc.nextInt();
			switch (i) {
			case 1:
				library.printLib();
				break;
			case 2:
				library.sortLib();
				library.printLib();
				break;
			case 3:
				System.out.println("Input number of authors to search");
				int number = sc.nextInt();
				sc.nextLine();
				for (int q = 0; q < number; q++) {
					System.out.println("Input author name #" + (q + 1));
					String authorName = sc.nextLine();
					ArrayList<Book> lib1 = library.searchByAuthor(authorName);
					if (lib1.isEmpty()) {
						System.out.println("Sorry, didnt find required book");
					} else {
						for (Book b : lib1) {
							System.out.println(b);
						}
					}
					// System.out.println("Make your choice");
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter book title");
				String title = sc.nextLine();
				System.out.println("Enter book author");
				String author = sc.nextLine();
				System.out.println("Enter year of publishment");
				int year = sc.nextInt();

				Book book = new Book(title, author, year);
				library.addBook(book);
				break;
			case 5:
				System.out.println("Input book title ");
				String titleToDelete = sc.next();
				library.deleteBook(titleToDelete);
				break;
			case 0:
				System.out.println("Goodbuy! Come again.");
				System.exit(0);
			default:
				System.out.println("Incorrect input.");
				break;
			}
			System.out.println("\n" + "If you want something else choose one of the options: \n" + optionOne + "\n"
					+ optionTwo + "\n" + optionThree + "\n" + optionFour + "\n" + optionFive + "\n\n\n" + exit + "\n"
					+ "Input your choice: ");
		}

	}

}
