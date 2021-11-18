package com.coffee;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void Menu() {
		System.out.println("\t****** Menu Coffee ****** \n");
		System.out.println("1 : Americano \t\t\t 3DH");
		System.out.println("2 : Cappuccino \t\t\t 5DH");
		System.out.println("3 : Espresso \t\t\t 4DH \n");

		System.out.println("\t****** Menu Chocolat ****** \n");
		System.out.println("4 : Chocolat Fort \t\t 2DH");
		System.out.println("5 : Chocolat avec liat \t\t 3DH\n");

		System.out.println("\t****** Menu Lait ****** \n");
		System.out.println("6 :  Lait chaud \t\t 1DH\n");

		System.out.println("\t****** Menu Tea ****** \n");
		System.out.println("7 :  Tea limon \t\t\t 2DH\n");

		System.out.println("8 : Quitter");
	}

	public static void checkChoix(int choix) {
		switch (choix) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int choix;
		// menu

		System.out.println("--Binvenue chez Coffee Youcode--\n");
		do {
			Menu();
			System.out.println("Entrer votre choix :");
			choix = input.nextInt();
			if (choix < 1 || choix > 8) {
				System.out.println("--Votre choix est invalid ! --\n");
			}
		} while (choix < 1 || choix > 8);
		checkChoix(choix);

	}

}
