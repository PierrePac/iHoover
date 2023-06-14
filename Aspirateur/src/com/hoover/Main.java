/**
 * 
 */
package com.hoover;

import java.util.Scanner;
import com.hoover.*;

/**
 * Cette class représente le point d'entré de l'application iHoover.
 * Elle va permettre de créer des instance des class Piece, Aspirateur et Instructions et 
 * permettre a l'utilisateur de remplir les données les concernants.
 * Enfin, la class va executer les instructions et retourner un résultat adéquat
 *
 * 
 * @author pac
 *
 */
public class Main {
	
	/**
	 * La méthode main de iHoover application 
     * Demande à l'utilisateur les données initiales sur la pièce, l'aspirateur et les instructions.
     * Execute les instrucions.
     * 
     * @param args The command-line arguments.
     */	
	public static void main(String[] args) {
		
	
		Piece piece = new Piece();
		piece.demanderTaillePiece();
		
		Aspirateur aspirateur = new Aspirateur();
		aspirateur.demanderPositionInitial();
		
		// Vérifie si l'aspirateur est dans la pièce avant d'exécuter les instructions
		if (aspirateur.positionX <= piece.largeur && aspirateur.positionX >= 0 && aspirateur.positionY <= piece.hauteur && aspirateur.positionY >= 0) {
			Instructions instructionsObj = new Instructions();
			String instructions = instructionsObj.demandeInstruction();
			
			instructionsObj.executerInstructions(instructions, aspirateur, piece);
		} else {
			System.out.println("L'aspirateur n'est pas dans la pièce !");
		}
		
		
	
	}
	
	
}
