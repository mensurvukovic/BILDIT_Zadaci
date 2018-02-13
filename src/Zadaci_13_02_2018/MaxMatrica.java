package Zadaci_13_02_2018;

import java.util.Scanner;

public class MaxMatrica {

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
		
		maxMatrica(matrica);

	}
	
	
	public static void maxMatrica(double[ ][ ] matrica){
		
		double max = matrica[0][0];
		int indexRed = 0;
		int indexKolona = 0;
		for (int red = 0; red < matrica.length; red++) {
			for (int kolona = 0; kolona < matrica[red].length; kolona++) {
				if(matrica[red][kolona]>max){
					max = matrica [red][kolona];
					indexRed = red;
					indexKolona = kolona;
				}
			}
			
		}
		System.out.println("Najveci element u matrici je " + max + " na lokaciji " + indexRed + ", " + indexKolona);

	}

}
