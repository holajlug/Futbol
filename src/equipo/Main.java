package equipo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu() {
		Equipo equipo = new Equipo();
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1. Crear un jugador");
			System.out.println("2. Crear un equipo");
			System.out.println("3. Salir");
		
			switch (opcion) {
			case 1: 
			case 2: 
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
				System.out.println("------------------------------");
				System.out.println();
				break;
			}
		}while (opcion != 3);
		
	}

}
