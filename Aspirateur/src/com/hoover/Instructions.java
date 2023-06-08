package com.hoover;

import java.util.Scanner;

/**
 * La classe Instructions représente les instructions à exécuter par l'aspirateur. 
 * Elle permet de demander à l'utilisateur de saisir une suite d'instructions
 * et d'exécuter ces instructions en contrôlant les limites de la pièce.
 */
public class Instructions {
	
	private String instructions;
	
	/**
	 * Demande à l'utilisateur de saisir une suite d'instructions (A = avancer, D = tourner à droite, G = tourner à gauche).
	 * 
	 * @return La chaîne de caractères contenant les instructions saisies par l'utilisateur.
	 */
	public String demandeInstruction() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Donner une suite d'instruction (A= avancer, D= tourner a droite et G = tourner à gauche");
		instructions = scanner.nextLine();
		
		scanner.close();
		
		return instructions;
	}
	
	/**
	 * Exécute les instructions fournies en mettant à jour la position de l'aspirateur et en contrôlant les limites de la pièce.
	 * Affiche également un message si l'aspirateur rencontre un mur.
	 * 
	 * @param instructions La chaîne de caractères contenant les instructions à exécuter.
	 * @param aspirateur L'instance de la classe Aspirateur représentant l'aspirateur en cours d'exécution.
	 * @param piece L'instance de la classe Piece représentant la pièce où évolue l'aspirateur.
	 */
	public void executerInstructions(String instructions, Aspirateur aspirateur, Piece piece) {
		boolean aRencontreUnMur = false;
		
		for (char instruction : instructions.toCharArray()) {
			if (aRencontreUnMur) {
				System.out.println("L'aspirateur à rencontré un mur !");
				break;
			}
			switch (instruction) {
				case 'A' :
					switch (aspirateur.orientation) {
						case 'N':
							if(aspirateur.positionY < piece.hauteur) {
								aspirateur.avancer();
							} else {
								aRencontreUnMur = true;
							}
							break;
						case 'S' :
							if(aspirateur.positionY > 0) {
								aspirateur.avancer();
							} else {
								aRencontreUnMur = true;
							}
							break;
						case 'E' :
							if(aspirateur.positionX < piece.largeur) {
								aspirateur.avancer();
							} else {
								aRencontreUnMur = true;
							}
							break;
						case 'W' :
							if(aspirateur.positionX > 0) {
								aspirateur.avancer();
							} else {
								aRencontreUnMur = true;
							}
					}
					
					break;
				case 'G' :
				case 'D' :
					aspirateur.tourner(instruction);
					break;
				default :
					System.out.println("Instruction non reconnue : " + instruction);
			}
		}
		System.out.println(aspirateur.getPosition());
	}

}
