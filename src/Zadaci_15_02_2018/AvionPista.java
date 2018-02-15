package Zadaci_15_02_2018;

import java.util.Scanner;

public class AvionPista {
	
	static Scanner unos=new Scanner(System.in);

	public static void main(String[] args) {
		

		System.out.print("Unesite brzinu aviona:");
		double v=unos.nextDouble();
		
		System.out.print("Unesite ubrzanje aviona:");
		double a=unos.nextDouble();
		
		System.out.printf("Minimalna dužina piste za polijetanje aviona je %.2f", v*v/(2*a));

	}

}
