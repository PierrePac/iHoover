package com.hoover;

import java.util.Scanner;

/**
 * La classe Piece représente une pièce où évolue l'aspirateur. Elle est caractérisée par sa largeur et sa hauteur.
 * Elle contient une méthode pour demander à l'utilisateur de saisir la taille de la pièce.
 */
public class Piece {
	public int largeur;
	public int hauteur;
	
	/**
	 * Demande à l'utilisateur de saisir la largeur et la hauteur de la pièce.
	 */
	public void demanderTaillePiece() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la largeur de la pièce: ");
		largeur = scanner.nextInt();
		
		System.out.println("Entrez la longeur de la pièce: ");
		hauteur = scanner.nextInt();
		
	}
}
