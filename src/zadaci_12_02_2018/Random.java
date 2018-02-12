package zadaci_12_02_2018;

public class Random {

	public static void main(String[] args) {

		int[] niz = new int[100];
		int[] brojac = new int[100];

		for (int i = 0; i <= niz.length - 1; i++) {

			int clan = (int) (Math.random() * 10);
			niz[i] = clan;
			brojac[clan]++;
		}

		for (int i = 0; i <= niz.length - 1; i++) {
			System.out.print(niz[i] + ",");
		}
		System.out.println();

		for (int i = 0; i <= niz.length - 1; i++) {

			if (brojac[i] != 0) {
				System.out.println(i + " se pojavljuje " + brojac[i] + (brojac[i] == 1 ? " put." : " puta."));
			}
		}

	}

}
