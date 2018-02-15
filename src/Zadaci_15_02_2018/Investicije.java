package Zadaci_15_02_2018;

import java.util.Scanner;

public class Investicije {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite iznos investicije: ");
		double investicija = unos.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu: ");
		double stopa = unos.nextDouble();
		System.out.println("Unesit broj godina: ");
		int godine = unos.nextInt();

		double mjesecnaInteresnaStopa = (stopa / 1200);

		double buducaVrijednostInvesticije = investicija * Math.pow((1 + mjesecnaInteresnaStopa), (godine * 12));

		System.out.printf("Buduca vrijednost investicije iznosi: %.2f", buducaVrijednostInvesticije);

	}

}
