package Zadaci_14_02_2018;

import java.util.Scanner;

public class Prefik2Stringa {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite prvi string: ");
		String s1 = unos.nextLine();

		System.out.println("Unesite drugi string: ");
		String s2 = unos.nextLine();

		prefiks(s1, s2);

	}

	public static void prefiks(String s1, String s2) {

		String prefiks = "";

		for (int i = 0; i <= s1.length() - 1; i++) {

			if (s1.charAt(i) == s2.charAt(i)) {
				prefiks += s1.charAt(i);
			} else {
				break;
			}

		}

		if (prefiks.isEmpty()) {
			System.out.println("Stringovi " + s1 + " i " + s2 + " nemaju zajednicki prefiks.");
		} else {
			System.out.println("Zajednicki prefiks za dva stringa je: " + prefiks);
		}

	}
}