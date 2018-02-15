package Zadaci_15_02_2018;

import java.util.Scanner;

public class Karakteri {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite neki string: ");
		String str = unos.nextLine();

		neparniCh(str);

	}

	public static void neparniCh(String str) {

		for (int i = 0; i < str.length(); i++) {
			if ((i + 1) % 2 != 0) {
				if (Character.isLetter(str.charAt(i))) {
					System.out.print(str.charAt(i));
				}
			}
		}
	}
}
