package Zadaci_15_02_2018;

import java.util.Scanner;

public class ReversePalindrom {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite cijeli broj: ");
		int number = unos.nextInt();

		if (isPalindrome(number)) {
			System.out.println("Uneseni broj je palindrom.");
		} else {
			System.out.println("Uneseni broj nije palindrom.");
		}

	}

	public static int reverse(int number) {

		int reverseNum = 0;
		while (number != 0) {

			reverseNum = reverseNum * 10;
			reverseNum += (number % 10);
			number /= 10;
		}
		return reverseNum;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

}
