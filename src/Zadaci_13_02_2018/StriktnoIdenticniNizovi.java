package Zadaci_13_02_2018;

import java.util.Scanner;

public class StriktnoIdenticniNizovi {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite duzinu nizova: ");
		int n = unos.nextInt();

		int[] niz1 = new int[n];
		int[] niz2 = new int[n];

		System.out.println("Unesite clanove prvog niza: ");
		for (int i = 0; i <= niz1.length - 1; i++) {
			int clan = unos.nextInt();
			niz1[i] = clan;
		}

		System.out.println("Unesite clanove drugog niza: ");
		for (int i = 0; i <= niz2.length - 1; i++) {
			int clan = unos.nextInt();
			niz2[i] = clan;
		}

		if (equals(niz1, niz2)) {
			System.out.println("Dva niza su striktno identicna.");
		} else {
			System.out.println("Dva niza nisu striktno identicna.");
		}

	}

	public static boolean equals(int[] niz1, int[] niz2) {

		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i])
				return false;
		}
		return true;
	}
}