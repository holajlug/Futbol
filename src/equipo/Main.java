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
			System.out.println("3. mostrar datos de los jugadores");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
		
			switch (opcion) {
			case 1: 
			case 2: 
			case 3:
				
			case 4: 
				System.out.println("Saliendo del programa...");

				break;
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
				System.out.println("------------------------------");
				System.out.println();
				break;
			}
		}while (opcion != 4);
		
	}

}
