package Zadaci_14_02_2018;

import java.util.Scanner;

public class Stednja {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		double mj_iznos, god_kamata, mj_kamata, ukupan_iznos = 0;
		int i, broj_mj;

		System.out.print("Unesite mjesecni iznos stednje: ");
		mj_iznos = unos.nextDouble();

		System.out.print("Unesite godisnju kamatu: ");
		god_kamata = unos.nextDouble();

		System.out.print("Unesite broj mjeseci stednje: ");
		broj_mj = unos.nextInt();

		mj_kamata = ((god_kamata / 1200) + 1);

		for (i = 1; i <= broj_mj; i++) {

			ukupan_iznos = (ukupan_iznos + mj_iznos) * mj_kamata;

		}

		System.out.print("Ukupan iznos ustedjevine za " + broj_mj + " mjeseca iznosi: " + ukupan_iznos);

	}

}
