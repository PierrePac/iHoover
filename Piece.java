import java.util.Scanner;

public class Piece {
	private int largeur;
	private int hauteur;
	
	public void demanderTaillePiece() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la largeur de la pièce: ");
		largeur = scanner.nextInt();
		
		System.out.println("Entrez la longeur de la pièce: ");
		hauteur = scanner.nextInt();
		
		scanner.close();
	}
}
