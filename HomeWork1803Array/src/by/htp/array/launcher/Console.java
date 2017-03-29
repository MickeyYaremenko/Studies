package by.htp.array.launcher;

import java.io.InputStreamReader;
import java.util.Scanner;

import by.htp.array.entity.InputCheck;
import by.htp.array.entity.IntArray;

public class Console {
	public static void main(String[] Args) {
		IntArray sort = new IntArray();
		InputCheck check = new InputCheck();

		System.out.println("Введите однозначное целое число, чтобы выбрать дейстиве:");
		System.out.println("1. Заполнить массив случайными значениями.");
		System.out.println("2. Вывести массив на экран.");
		System.out.println("3. Добавить новый элемент.");
		System.out.println("4. Отсортировать массив по возрастанию.");
		System.out.println("5. Отсортировать массив по убыванию.");
		System.out.println("6. Вывести на экран минимальное значение.");
		System.out.println("7. Вывести на экран максимальное значение.");

		while (true) {
			String input = check.input();
			if (check.validCheck(input)) {
				int num = Integer.parseInt(input);
				switch (num) {
				case 1:
					sort.fill();
					break;

				case 2:
					sort.print();
					break;
				case 3:
					System.out.println("Введите значение элемента, который необходимо добавить в массив");
					Scanner sc2 = new Scanner(new InputStreamReader(System.in));
					int num2 = sc2.nextInt();
					sort.addElement(num2);
					break;
				case 4:
					sort.ascendingSort();
					break;
				case 5:
					sort.descendingSort();
					break;
				case 6:
					sort.findMin();
					break;
				case 7:
					sort.findMax();
					break;
				}

			} else {
				System.out.println("Введены некорректные данные, введите однзначное число:");
			}
		}

	}

}
