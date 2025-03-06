package equipo;

import java.util.Scanner;

import equipo.jugadores.Jugador;
import equipo.jugadores.porteros.Portero;

public class Main {

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu() {
		Equipo e = new Equipo();
		int opcion;
		int opcionJugador;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1. Crear un equipo");
			System.out.println("2. Crear un jugador");
			System.out.println("3. Salir");
			Scanner sca = new Scanner(System.in);
			opcion = sca.nextInt();
			switch (opcion) {
			case 1: 
				
			case 2:
				System.out.println("\nNombre: ");
				String nombre = sca.next();
				System.out.println("\nDorsal: ");
				int dorsal = sca.nextInt();
				System.out.println("\nEquipo: ");
				String equipo = sca.next();
				System.out.println("\nPosición: "
						+ "\n1.Portero: "
						+ "\n2.Defensas: "
						+ "\n3.Centrocampistas: "
						+ "\n4.Delantero: ");
				opcionJugador = sca.nextInt();
				switch (opcionJugador) {
					case 1:
						System.out.println("\nParadas: ");
						int paradas = sca.nextInt();
						Jugador jug = new Portero(nombre,dorsal,equipo,paradas);
						e.addJugador(jug,0);
		
					case 2:
						
					case 3:
						
					case 4:
				
				}
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
				System.out.println("------------------------------");
				System.out.println();
				break;
			}
		}while (opcion != 3);
		
	}

}
