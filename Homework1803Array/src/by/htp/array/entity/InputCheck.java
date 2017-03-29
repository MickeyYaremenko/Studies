package by.htp.array.entity;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InputCheck {

	public boolean validCheck(String input) {

		if (input.matches("\\d")) {
			return true;
		} else {
			return false;
		}
	}

	public String input() {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String one = sc.next();
		return one;
	}

}
