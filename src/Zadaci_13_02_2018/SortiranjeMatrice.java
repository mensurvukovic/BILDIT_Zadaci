package Zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeMatrice {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite velicinu matrice: ");
		int n = unos.nextInt();
		int m = unos.nextInt();

		double[][] matrica = new double[n][m];

		System.out.println("Unesite " + matrica.length + " redova i " + matrica[0].length + " kolona: ");

		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				matrica[red][kolona] = unos.nextInt();
			}
		}

		sortRows(matrica);

		int brojac = 0;
		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				System.out.print(matrica[red][kolona] + " ");
				brojac++;
				if (brojac % m == 0) {
					System.out.println();
				}
			}

		}
	}

	public static double[][] sortRows(double[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			Arrays.sort(matrica[i]);

		}
		return matrica;

	}
}
