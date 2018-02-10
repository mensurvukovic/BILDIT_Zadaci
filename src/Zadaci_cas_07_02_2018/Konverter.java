package Zadaci_cas_07_02_2018;

import java.util.Scanner;

public class Konverter {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("1. Kg u Lbs \n2. Lbs u Kg \n3. Cm u Inch \n4. Inch u Cm \n5. Celsius u Farenheit \n6. Farenheit u Celsius");
		int izbor = input.nextInt();
		
		switch(izbor){
		
		case 1:
			kgToLbs();
			Konverter.main(args);
			break;
			
		case 2:
			lbsToKg();
			Konverter.main(args);
			break;
			
		case 3: 
			cmToInch();
			Konverter.main(args);
			break;
			
		case 4:
			inchToCm();
			Konverter.main(args);
			break;
			
		case 5:
			cToF();
			Konverter.main(args);
			break;
		
		case 6: 
			fToC();
			Konverter.main(args);
			break;
			
		default:
			System.err.println("Pogresan unos, unesite broj od 1-6!");
			Konverter.main(args);
			break;
		}

	}
	
	public static void kgToLbs(){
		
		System.out.println("Unesite koliko kg zelite konvertovati u Lbs: ");
		double kg = input.nextDouble();
		
		double lbs = kg*2.046; 
		
		System.out.println(kg + " kg iznosi: " + lbs + " lbs.");
	}
	
	public static void lbsToKg(){
		
		System.out.println("Unesite koliko kg zelite konvertovati u Lbs: ");
		double lbs = input.nextDouble();
		
		double kg = lbs/2.046; 
		
		System.out.println(lbs + " lbs iznosi: " + kg + " kg.");
	}
	
	public static void cmToInch(){
		
		System.out.println("Unesite koliko cm zelite konvertovati u inch: ");
		double cm = input.nextDouble();
		
		double inch = cm/2.54; 
		
		System.out.println(cm + " cm iznosi: " + inch + " incha.");
	}
	
	public static void inchToCm(){
		
		System.out.println("Unesite koliko inchi zelite konvertovati u cm: ");
		double inch = input.nextDouble();
		
		double cm = inch*2.54; 
		
		System.out.println(inch + " inch iznosi: " + cm + " cm.");
	}
	
	public static void cToF(){
		
		System.out.println("Unesite koliko stepeni celzijusa zelite konvertovati u stepene farenheita: ");
		double c = input.nextDouble();
		
		double f = (1.8 * c) + 32;
		
		System.out.println(c + " stepeni celzijusa iznosi: " + f + " farenheita");
	}
	
	public static void fToC(){
		
		System.out.println("Unesite koliko stepeni farenheita zelite konvertovati u stepene celzijusafarenheita: ");
		double f = input.nextDouble();
		
		double c = (f-32) * 1.8;
		
		System.out.println(f + " stepeni farenheita iznosi: " + c + " celzijusa");
	}

}
