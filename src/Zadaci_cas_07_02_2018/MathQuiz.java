package Zadaci_cas_07_02_2018;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println(
				"1. Sabiranje \n2. Oduzimanje \n3. Mnozenje \n4. Dijeljenje \n5. Kvadriranje \n6. Korjenovanje");
		int izbor = input.nextInt();

		switch (izbor) {

		case 1:
			Random randomNum1 = new Random();
			Random randomNum2 = new Random();
			int num1 = randomNum1.nextInt(100);
			int num2 = randomNum2.nextInt(100);
			System.out.println("Koliko iznosi " + num1 + " + " + num2);
			int unos = input.nextInt();
			if(unos == num1 + num2){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);

			break;

		case 2:
			Random randomNum3 = new Random();
			Random randomNum4 = new Random();
			int num3 = randomNum3.nextInt(100);
			int num4 = randomNum4.nextInt(100);
			
			System.out.println("Koliko iznosi " + num3 + " - " + num4);
			unos = input.nextInt();
			if(unos == num3 - num4){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);

			break;

		case 3:
			Random randomNum5 = new Random();
			Random randomNum6 = new Random();
			int num5 = randomNum5.nextInt(100);
			int num6 = randomNum6.nextInt(100);
			
			System.out.println("Koliko iznosi " + num5 + " * " + num6);
			unos = input.nextInt();
			if(unos == num5 * num6){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);
			break;

		case 4:
			Random randomNum7 = new Random();
			Random randomNum8 = new Random();
			int num7 = randomNum7.nextInt(100);
			int num8 = randomNum8.nextInt(100);
			
			System.out.println("Koliko iznosi " + num7 + " / " + num8);
			unos = input.nextInt();
			if(unos == num7 / num8){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);
			break;

		case 5:
			Random randomNum9 = new Random();
			int num9 = randomNum9.nextInt(100);
						
			System.out.println("Koliko iznosi kvadrat broja " + num9);
			unos = input.nextInt();
			if(unos == Math.pow(num9, 2)){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);
			break;

		case 6:
			Random randomNum10 = new Random();
			int num10 = randomNum10.nextInt(100);
			
			System.out.println("Koliko iznosi korijen borja " + num10);
			double unos1 = input.nextInt();
			if(unos1 == Math.sqrt(num10)){
				System.out.println("Cestitamo tacan odgovor.");
			}else{
				System.err.println("Nazalost pogresan odgovor, pokusajte ponovno.");
			}
			MathQuiz.main(args);
			break;

		default:

		System.err.println("Unesite broje od 1-6: ");


		}

	}

		}