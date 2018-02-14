package Zadaci_14_02_2018;

public class SpilSimulacija {

	public static void main(String[] args) {

		int izbor_racunar, izbor_racunar1;

		izbor_racunar = (int) (Math.random() * 13);
		izbor_racunar1 = (int) (Math.random() * 4);

		switch (izbor_racunar) {

		case 0:
			System.out.print("Karta koju ste izvukli je A ");
			break;

		case 1:
			System.out.print("Karta koju ste izvukli je 2 ");
			break;

		case 2:
			System.out.print("Karta koju ste izvukli je 3 ");
			break;

		case 3:
			System.out.print("Karta koju ste izvukli je 4 ");
			break;

		case 4:
			System.out.print("Karta koju ste izvukli je 5 ");
			break;

		case 5:
			System.out.print("Karta koju ste izvukli je 6 ");
			break;

		case 6:
			System.out.print("Karta koju ste izvukli je 7 ");
			break;

		case 7:
			System.out.print("Karta koju ste izvukli je 8 ");
			break;

		case 8:
			System.out.print("Karta koju ste izvukli je 9 ");
			break;

		case 9:
			System.out.print("Karta koju ste izvukli je 10 ");
			break;

		case 10:
			System.out.print("Karta koju ste izvukli je J ");
			break;

		case 11:
			System.out.print("Karta koju ste izvukli je Q ");
			break;

		case 12:
			System.out.print("Karta koju ste izvukli je K ");
			break;

		default:

		}

		switch (izbor_racunar1) {

		case 0:
			System.out.print("kocka.");
			break;

		case 1:
			System.out.print("pik.");
			break;

		case 2:
			System.out.print("djetelina.");
			break;

		case 3:
			System.out.print("srce.");
			break;

		default:
		}

	}

}
