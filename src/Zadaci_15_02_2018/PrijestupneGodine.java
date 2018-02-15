package Zadaci_15_02_2018;

import java.util.Scanner;

public class PrijestupneGodine {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite pocetnu i krajnju godinu:");
		int pocetna_god = unos.nextInt();
		int krajnja_god = unos.nextInt();

		int brojac = 0;

		for (int i = pocetna_god; i <= krajnja_god; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				brojac++;

				if (brojac % 10 == 0) {
					System.out.println(i);
				} else {
					System.out.print(i + " ");
				}

			}
		}

	}

}
