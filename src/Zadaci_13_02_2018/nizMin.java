package Zadaci_13_02_2018;

import java.util.Scanner;

public class nizMin {
	
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		double[] niz = new double[10];

		System.out.println("Unesite clanove niza: ");

		for (int i = 0; i <= niz.length - 1; i++) {
			double clan = unos.nextDouble();
			niz[i] = clan;

		}

		System.out.println("Najmanji clan niza je: " + min(niz));

	}

	public static double min(double[] niz) {
		double min = niz[0];
		for (double clan : niz) {

			if (clan < min) {
				min = clan;
			}

		}
		return min;

	}

}
