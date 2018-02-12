package zadaci_12_02_2018;

import java.util.Scanner;

public class MaxNiza {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		int[] niz = new int[100];

		System.out.println("Unesite clanove niza, 0 prekida unos: ");

		for (int i = 0; i <= niz.length - 1; i++) {
			int clan = unos.nextInt();
			if(clan != 0){
			niz[i] = clan;
			}else{
				break;
			}
		}
		
		System.out.println("Najveci clan niza je " + max(niz) + " i ponavlja se " + brojanjeMax(niz) + " puta.");

	}

	public static double max(int[] niz) {
		int max = niz[0];
		for (int e : niz) {

			if (e > max) {
				max = e;
			}
		}
		return max;
	}
	
	public static int brojanjeMax(int[] niz){
		int brojac = 0;
		for(int e : niz){
			if(e == max(niz)){
				brojac++;
			}
		}
		return brojac;
	}

}
