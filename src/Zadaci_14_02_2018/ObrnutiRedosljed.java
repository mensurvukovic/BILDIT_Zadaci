package Zadaci_14_02_2018;

import java.util.Scanner;

public class ObrnutiRedosljed {
	
	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {
			
			int[] nizCijelihBrojeva = new int[10];
						
			System.out.println("Unesite deset cijelih brojeva: ");
			
			for (int i = 0; i <= 9; i++) {
				int broj = unos.nextInt();
				nizCijelihBrojeva[i] = broj;
			}
			
			obrnuto(nizCijelihBrojeva);

		}
		
		public static void obrnuto(int[] nizCijelihBrojeva){
			
			for (int i = 9; i>=0; i--){
				System.out.print(nizCijelihBrojeva[i] + " ");
			}

		}

	}
