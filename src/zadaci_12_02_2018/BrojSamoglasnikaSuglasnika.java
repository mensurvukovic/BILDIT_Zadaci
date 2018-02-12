package zadaci_12_02_2018;

import java.util.Scanner;

public class BrojSamoglasnikaSuglasnika {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		int brojacSamoglasnika = 0;
		int brojacSuglasnika = 0;

		System.out.println("Unesite neki string: ");
		String str = unos.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				brojacSamoglasnika++;
			} else if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
				brojacSuglasnika++;
			}
		}

		System.out.println("Ukupan broj samoglasnika u stringu je: " + brojacSamoglasnika
				+ "\nUkupan broj suglasnika u stringu je: " + brojacSuglasnika);
	}

}
