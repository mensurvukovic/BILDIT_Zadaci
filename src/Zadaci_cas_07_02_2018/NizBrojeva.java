package Zadaci_cas_07_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class NizBrojeva {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		double[] niz = new double[10];

		System.out.println("Unesite clanove niza: ");

		for (int i = 0; i <= niz.length - 1; i++) {
			double clan = unos.nextDouble();
			niz[i] = clan;

		}

		System.out.println("Najmanji clan niza je: " + min(niz));
		System.out.println("Najveci clan niza je: " + max(niz));
		System.out.println("Suma svih clanova niza je: " + suma(niz));
		System.out.println("Prosjek clanova niza je: " + prosjek(niz));
		System.out.println("Niz poslije sortiranja: ");
		sortiraj(niz);
		System.out.println("Niz bez duplikata: ");
		ukloniDuplikate(niz);

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

	public static double max(double[] niz) {
		double max = niz[0];
		for (double clan : niz) {

			if (clan > max) {
				max = clan;
			}
		}
		return max;
	}

	public static double suma(double[] niz) {
		double suma = 0;
		for (double clan : niz) {

			suma += clan;

		}
		return suma;
	}

	public static double prosjek(double[] niz) {
		double suma = 0;
		for (double clan : niz) {

			suma += clan;
		}
		double prosjek = suma / 10;
		return prosjek;
	}

	public static void ukloniDuplikate(double[] niz) {

		ArrayList<Double> list = new ArrayList<>();

		for (double e : niz) {
			list.add(e);
		}

		LinkedHashSet<Double> hashSet = new LinkedHashSet<Double>(list);

		System.out.println(hashSet);

	}

	public static void sortiraj(double[] niz) {

		ArrayList<Double> list = new ArrayList<>();

		for (double e : niz) {
			list.add(e);
		}

		Collections.sort(list);

		System.out.println(list);

	}

}
