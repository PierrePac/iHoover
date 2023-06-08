package com.hoover;

import java.util.Scanner;

/**
 * La classe Aspirateur représente un aspirateur caractérisé par sa position (X et Y) et son orientation.
 * Elle contient des méthodes pour initialiser la position et l'orientation, pour déplacer l'aspirateur (avancer et tourner),
 * ainsi que pour obtenir la position finale de l'aspirateur.
 */
public class Aspirateur {
	public int positionX;
	public int positionY;
	public char orientation;
	
	
	/**
	 * 
	 * Demande à l'utilisateur de rentrer la position en X et Y de l'aspirateur ainsi que son orientation
	 * Vérification de l'input de l'utilisateur et répétition de la question tant que l'input n'est pas correct
	 * 
	 */
	public void demanderPositionInitial() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la position X initial de l'aspirateur: ");
		positionX = scanner.nextInt();
		
		System.out.println("Entrez la position Y initial de l'aspirateur: ");
		positionY = scanner.nextInt();
		
		do {
			System.out.println("Entrez l'orientation de l'aspirateur (N, E, W, S): ");
			orientation = scanner.next().charAt(0);
		}while (orientation != 'N' && orientation != 'E' && orientation != 'W' && orientation != 'S');
	}
	
	/**
	 * Déplace l'aspirateur en fonction de son orientation actuelle.
	 */
	public void avancer() {
		switch(orientation) {
			case 'N':
				positionY++;
				break;
			case 'E':
				positionX++;
				break;
			case 'W':
				positionX--;
				break;
			case 'S':
				positionY--;
				break;
		}	
	}
	
	/**
	 * Tourne l'aspirateur vers la droite (D) ou la gauche (G) en fonction de l'instruction donnée.
	 * @param pivot L'instruction de rotation (D pour droite, G pour gauche).
	 */
	public void tourner(char pivot) {
		switch (pivot) {
		case 'D':
			switch (orientation) {
			case 'N':
				orientation = 'E';
				break;
			case 'E':
				orientation = 'S';
				break;
			case 'W':
				orientation = 'N';
				break;
			case 'S':
				orientation = 'W';
				break;
			}
			break;
		case 'G' :
			switch (orientation) {
			case 'N':
				orientation = 'W';
				break;
			case 'E':
				orientation = 'N';
				break;
			case 'W':
				orientation = 'S';
				break;
			case 'S':
				orientation = 'E';
				break;
			}
			break;
		}
	}
	
	/**
	 * Retourne la position finale de l'aspirateur sous forme d'une chaîne de caractères.
	 * @return La position finale de l'aspirateur.
	 */
	public String getPosition() {
		return "position finale : x="+ positionX +" y="+ positionY +" orientation="+ orientation;
	}
} 
