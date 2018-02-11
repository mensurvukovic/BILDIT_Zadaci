package Zadaci_cas_07_02_2018;

import java.util.Scanner;

public class Stringovi {

	static Scanner unos = new Scanner(System.in);

	public static void main(java.lang.String[] args) {

		System.out.println("Unesite neki string: ");
		String str = unos.nextLine();
		
		System.out.println("Duzina unesenog stringa je: " + str.length());
		parniCh(str);
		neparniCh(str);
		uppercaseCh(str);
		lowercaseCh(str);
		chNijeSlovo(str);

	}
	
	public static void parniCh(String str){
	System.out.print("Karakteri na parnim mjestima su: ");
		for(int i = 1; i<str.length(); i++){
			if((i+1)%2==0){
				System.out.print(str.charAt(i) + ", ");
			}
		}
	}
	
	public static void neparniCh(String str){
		System.out.print("\nKarakteri na neparnim mjestima su: ");
		for(int i = 1; i<str.length(); i++){
			if((i+1)%2!=0){
				System.out.print(str.charAt(i) + ", ");
			}
		}
	}
	
	public static void uppercaseCh(String str){
		
		int count = 0;
		for(int i = 0; i<str.length(); i++){
			if(Character.isUpperCase(str.charAt(i))){
				count++;
				
			}
		}
		System.out.println("\nBroj uppercase karaktera je: " + count);
	}

	public static void lowercaseCh(String str){
		
		int count = 0;
		for(int i = 0; i<str.length(); i++){
			if (Character.isLowerCase(str.charAt(i))){
				count++;
				
			}
		}
		System.out.println("Broj lowercase karaktera je: " + count);
	}
	
	public static void chNijeSlovo(String str){
		System.out.print("Karakteri koji nisu slovo su: ");
		for(int i = 0; i<str.length(); i++){
			if(!Character.isLetter(str.charAt(i))){
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}
