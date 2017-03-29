package by.htp.array.entity;

public class IntArray {

	private int arrayLength = (int) (Math.random() * 5 + 5);
	private int[] array = new int[arrayLength];

	public void fill() {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
	}

	public void print() {
		System.out.println("Массив:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public void addElement(int element) {
		int[] temparr = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temparr[i] = array[i];
			array = temparr;
		}
		array[array.length - 1] = element;
	}

	public void ascendingSort() { // шейкерная сортировка по возрастанию
		int left = 0;
		int right = array.length - 1;
		int q = 0;
		while (left < right) {
			for (int i = left; i < right; i++) {
				if (array[i] > array[i + 1]) {
					q = array[i];
					array[i] = array[i + 1];
					array[i + 1] = q;
					q = i;
				}
			}
			right = q;
			if (left >= right) {
				break;
			}
			for (int j = right; j > left; j--) {
				if (array[j - 1] > array[j]) {
					q = array[j];
					array[j] = array[j - 1];
					array[j - 1] = q;
					q = j;
				}
			}
			left = q;
		}
	}

	public void descendingSort() { // шейкерная сортировка по убыванию
		int left = 0;
		int right = array.length - 1;
		int q = 0;
		while (left < right) {
			for (int i = left; i < right; i++) {
				if (array[i] < array[i + 1]) {
					q = array[i];
					array[i] = array[i + 1];
					array[i + 1] = q;
					q = i;
				}
			}
			right = q;
			if (left >= right) {
				break;
			}
			for (int j = right; j > left; j--) {
				if (array[j - 1] < array[j]) {
					q = array[j];
					array[j] = array[j - 1];
					array[j - 1] = q;
					q = j;
				}
			}
			left = q;
		}
	}

	public void findMax() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Максимальный элемент: " + max);
	}

	public void findMin() {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Минимальный элемент: " + min);
	}
}
