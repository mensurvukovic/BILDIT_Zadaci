package Zadaci_cas_07_02_2018;

import java.util.Scanner;

public class Kalkulator {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"1. Sabiranje \n2. Oduzimanje \n3. Mnozenje \n4. Dijeljenje \n5. Kvadriranje \n6. Korjenovanje");
		int izbor = input.nextInt();

		switch (izbor) {

		case 1:
			System.out.println("Unesite prvi broj: ");
			double num1 = input.nextDouble();
			System.out.println("Unesite drugi broj: ");
			double num2 = input.nextDouble();

			System.out.println("Suma brojeva " + num1 + " i " + num2 + " iznosi: " + sabiranje(num1, num2));
			Kalkulator.main(args);
			break;

		case 2:
			System.out.println("Unesite prvi broj: ");
			double num3 = input.nextDouble();
			System.out.println("Unesite drugi broj: ");
			double num4 = input.nextDouble();

			System.out.println("Razlika brojeva " + num3 + " i " + num4 + " iznosi: " + oduzimanje(num3, num4));
			Kalkulator.main(args);
			break;

		case 3:
			System.out.println("Unesite prvi broj: ");
			double num5 = input.nextDouble();
			System.out.println("Unesite drugi broj: ");
			double num6 = input.nextDouble();

			System.out.println("Proizvod brojeva " + num5 + " i " + num6 + " iznosi: " + mnozenje(num5, num6));
			Kalkulator.main(args);
			break;

		case 4:
			System.out.println("Unesite prvi broj: ");
			double num7 = input.nextDouble();
			System.out.println("Unesite drugi broj: ");
			double num8 = input.nextDouble();

			System.out.println("Kolicnik brojeva " + num7 + " i " + num8 + " iznosi: " + dijeljenje(num7, num8));
			Kalkulator.main(args);
			break;

		case 5:
			System.out.println("Unesite broj koji zelite kvadrirati: ");
			double num9 = input.nextDouble();

			System.out.println("Kvadrat broja " + num9 + " je " + kvadriranje(num9));
			Kalkulator.main(args);
			break;

		case 6:
			System.out.println("Unesite broj koji zelite korjenovati: ");
			double num10 = input.nextDouble();

			System.out.println("Korijen broja " + num10 + " je " + korijenovanje(num10));
			Kalkulator.main(args);
			break;

		default:

			System.err.println("Unesite broje od 1-6: ");
			Kalkulator.main(args);

		}

	}

	public static double sabiranje(double num1, double num2) {

		double suma = num1 + num2;
		return suma;

	}

	public static double oduzimanje(double num1, double num2) {

		double razlika;

		if (num1 > num2) {
			razlika = num1 - num2;
		} else {
			razlika = num2 - num1;
		}
		return razlika;

	}

	public static double mnozenje(double num1, double num2) {

		double proizvod = num1 * num2;
		return proizvod;

	}

	public static double dijeljenje(double num1, double num2) {

		double kolicnik = num1 / num2;
		return kolicnik;

	}

	public static double kvadriranje(double num1) {

		double kvadrat = Math.pow(num1, 2);
		return kvadrat;

	}

	public static double korijenovanje(double num1) {

		double korijen = Math.sqrt(num1);
		return korijen;

	}

}
