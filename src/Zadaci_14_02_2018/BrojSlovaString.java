package Zadaci_14_02_2018;

import java.util.Scanner;

public class BrojSlovaString {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Unesite neki string: ");
		String s = unos.nextLine();

		System.out.println("Broj slova u stringu " + s + " je: " + prebrojiSlova(s));

	}

	public static int prebrojiSlova(String s) {

		int brojac = 0;

		for (int i = 0; i <= (s.length() - 1); i++) {

			if (Character.isLetter(s.charAt(i))) {

				brojac++;

			}
		}
		return brojac;
	}
}