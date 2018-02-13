package Zadaci_13_02_2018;

import java.util.Scanner;

public class ProstiBrojevi {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite pocetni broj: ");
		int pocetni = unos.nextInt();
		System.out.println("Unesite krajnji broj: ");
		int krajnji = unos.nextInt();
		System.out.println("Unesite broj isprintanih brojeva po liniji: ");
		int printBroj = unos.nextInt();
		
		prostiBrojevi(pocetni, krajnji, printBroj);
		
	}

	public static void prostiBrojevi(int pocetni, int krajnji, int printBroj) {

		int brojac = 1;

		for (int i = pocetni; i <= krajnji; i++) {
			int prosti = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					prosti++;
				}
			}
			if (prosti == 2) {

				if (brojac % printBroj == 0) {

					System.out.println(i);

				} else {

					System.out.print(i + " ");
				}
				brojac++;
			}

		}

	}
}
