package com.coffee;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	private static int prixEntree = 0;
	private static int pieceEntrer = 0;

	private static int dirham = 1;
	private static int quntitieDirham = 10;

	private static int deuxDirham = 2;
	private static int quntitiedeuxDirham = 10;

	private static int cinqDirham = 5;
	private static int quntitiecinqDirham = 10;

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

	public static int checkPiece(int piece, int prix) {
		prixEntree = piece;
		int newPrix;
		if (prixEntree < 1) {
			System.out.println("Le prix n'est pas valable");
		}
		while (prixEntree < prix) {
			System.out.println("Le prix ne suffit pas");
			System.out.println("Entrer un nouveux piece : ");
			newPrix = input.nextInt();
			prixEntree += newPrix;
		}

		return prixEntree;
	}
//operationCoffee
	public static String operationCoffee(int piece, int prix) {
		String resultat = "Argent restant : ";

		prixEntree = piece - prix;
		int nombrePiece = 0, restPiece = 0;
		// System.out.println(prixEntree);
		if (prixEntree > cinqDirham) {
			if (quntitiecinqDirham > 1) {
				nombrePiece = prixEntree / 5;
				restPiece = prixEntree % 5;
				if (restPiece>deuxDirham) {
					
				}
				// System.out.println(restPiece);
				quntitiecinqDirham = quntitiecinqDirham - 1;
				resultat = resultat + nombrePiece+" (5DH) ";
				
			}
		} else if (prixEntree < cinqDirham && prixEntree > deuxDirham) {
			if (quntitiedeuxDirham > 1) {
				prixEntree = prixEntree - 2;
				quntitiedeuxDirham = quntitiedeuxDirham - 1;
				resultat = resultat + "2DH ";
			}
		} else if (prixEntree < deuxDirham && prixEntree > dirham) {
			if (quntitieDirham > 1) {
				prixEntree = prixEntree - 1;
				quntitieDirham = quntitieDirham - 1;
				resultat = resultat + "1DH ";
			}
		}
		return resultat;

	}

	public static void checkChoix(int choix) {
		switch (choix) {
		case 1:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 3);
			System.out.println(prixEntree);
			System.out.println(operationCoffee(pieceEntrer, 3));
			break;
		case 2:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 5);
			System.out.println(operationCoffee(pieceEntrer, 5));
			break;
		case 3:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 4);
			System.out.println(operationCoffee(pieceEntrer, 4));
			break;
		case 4:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 2);
			System.out.println(operationCoffee(pieceEntrer, 2));
			break;
		case 5:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 3);
			System.out.println(operationCoffee(pieceEntrer, 3));
			break;
		case 6:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 1);
			System.out.println(operationCoffee(pieceEntrer, 1));
			break;
		case 7:
			System.out.println("Entrer un piece : ");
			pieceEntrer = input.nextInt();
			prixEntree = checkPiece(pieceEntrer, 2);
			System.out.println(operationCoffee(pieceEntrer, 2));
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
