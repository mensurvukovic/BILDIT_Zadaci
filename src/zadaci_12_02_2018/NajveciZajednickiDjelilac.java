package zadaci_12_02_2018;

import java.util.Scanner;

public class NajveciZajednickiDjelilac {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite dva broja: ");
		int br1 = unos.nextInt();
		int br2 = unos.nextInt();

		if (br1 > br2) {
			int temp = br2;
			br2 = br1;
			br1 = temp;
		}
		
		int nzd = 1;

		for (int i = 1; i <= br1; i++) {
			if (br1 % i == 0 && br2 % i == 0) {
				nzd = i;
			}
		}
		
		System.out.println("Najveci zajednicki djelilac za brojeve " + br1 + " i " + br2 + " je: " + nzd);

	}

}
