import java.util.Scanner;

public class Aspirateur {
	private int positionX;
	private int positionY;
	private char orientation;
	
	public void demanderPositionInitial() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la position X initial de l'aspirateur: ");
		positionX = scanner.nextInt();
		
		System.out.println("Entrez la position Y initial de l'aspirateur: ");
		positionY = scanner.nextInt();
		
		System.out.println("Entrez l'orientation de l'aspirateur (N, E, W, S): ");
		orientation = scanner.next().charAt(0);
		
		scanner.close();
	}
	
	public void avancer() {
		switch(orientation) {
			case 'N':
				positionX++;
				break;
			case 'E':
				positionY++;
				break;
			case 'W':
				positionY--;
				break;
			case 'S':
				positionX--;
				break;
		}	
	}
	
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
	
	public String getPosition() {
		return "position finale : x="+ positionX +" y="+ positionY +" orientation="+ orientation;
	}
} 
