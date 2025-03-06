package equipo;

import java.util.Scanner;

import equipo.jugadores.Jugador;
import equipo.jugadores.centrocampistas.Mediapunta;
import equipo.jugadores.centrocampistas.Pivote;
import equipo.jugadores.defensas.Central;
import equipo.jugadores.defensas.Lateral;
import equipo.jugadores.defensas.Puesto;
import equipo.jugadores.delanteros.DelanteroCentro;
import equipo.jugadores.delanteros.Extremo;
import equipo.jugadores.delanteros.PuestoDelantero;
import equipo.jugadores.porteros.Portero;

public class Main {

	public static void main(String[] args) {
		Equipo e = new Equipo();
		menu(e);
	}
	
	public static void menu(Equipo e) {
		Scanner sca = new Scanner(System.in);
		int opcion;
		int opcionJugador;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1. Crear un jugador");
			System.out.println("2. Mostrar Información");
			System.out.println("3. Salir");
			opcion = sca.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("\nNombre: ");
				String nombre = sca.next();
				System.out.println("\nDorsal: ");
				int dorsal = sca.nextInt();
				System.out.println("\nEquipo: ");
				String equipo = sca.next();
				System.out.println("\nPosición: "
						+ "\n1.Portero: "
						+ "\n2.Lateral Izquierdo: "
						+ "\n3.Central Derecho: "
						+ "\n4.Central Izquierdo: "
						+ "\n5.Lateral Derecho: "
						+ "\n6.Medio Derecho: "
						+ "\n7.Medio Izquierdo: "
						+ "\n8.Mediapunta: "
						+ "\n9.Extremo Izquierdo: "
						+ "\n10.Extremo Derecho: "
						+ "\n11.Delantero Centro");
				opcionJugador = sca.nextInt();
				switch (opcionJugador) {
					case 1:
						System.out.println("\nParadas: ");
						int paradas = sca.nextInt();
						Jugador portero = new Portero(nombre,dorsal,equipo,paradas);
						e.addJugador(portero,0);
						break;
		
					case 2:
						System.out.println("\nDisputas Realizadas: ");
						int disputasRealizadas = sca.nextInt();
						Jugador lateralIz = new Lateral(nombre,dorsal,equipo,disputasRealizadas,Puesto.IZQUIERDO);
						e.addJugador(lateralIz,1);
						break;
						
					case 3:
						System.out.println("\nDisputas Realizadas: ");
						int disputasRealizada = sca.nextInt();
						Jugador lateralDer = new Lateral(nombre,dorsal,equipo,disputasRealizada,Puesto.DERECHO);
						e.addJugador(lateralDer,2);
						break;
					case 4:
						System.out.println("\nEntradas: ");
						int entradas = sca.nextInt();
						System.out.println("\nDisputas Realizadas: ");
						int disputas = sca.nextInt();
						Jugador centralIz = new Central(nombre,dorsal,equipo,disputas,entradas,Puesto.IZQUIERDO);
						e.addJugador(centralIz,3);
						break;
					case 5:
						System.out.println("\nEntradas: ");
						int entrada = sca.nextInt();
						System.out.println("\nDisputas Realizadas: ");
						int disputasReali = sca.nextInt();
						Jugador centralDer = new Central(nombre,dorsal,equipo,disputasReali,entrada,Puesto.DERECHO);
						e.addJugador(centralDer,4);
						break;
					case 6:
						System.out.println("\nIntercepciones: ");
						int intercepciones = sca.nextInt();
						int pasesCompletados = sca.nextInt();
						Jugador medioDer = new Pivote(nombre,dorsal,equipo,pasesCompletados,intercepciones,Puesto.IZQUIERDO);
						e.addJugador(medioDer,5);
						break;
					case 7:
						System.out.println("\nIntercepciones: ");
						int intercepcione = sca.nextInt();
						System.out.println("\nPases Completado: ");
						int pasesCompletado = sca.nextInt();
						Jugador medioIz = new Pivote(nombre,dorsal,equipo,pasesCompletado,intercepcione,Puesto.DERECHO);
						e.addJugador(medioIz,6);
						break;
					case 8:
						System.out.println("\nAsistencias: ");
						int asistencias = sca.nextInt();
						System.out.println("\nPases Completado: ");
						int pasesComple = sca.nextInt();
						Jugador mediapunta = new Mediapunta(nombre,dorsal,equipo,pasesComple,asistencias);
						e.addJugador(mediapunta,7);
						break;
					case 9:
						System.out.println("\nGoles: ");
						int goles = sca.nextInt();
						Jugador extremoIz = new Extremo(nombre,dorsal,equipo,goles,PuestoDelantero.IZQUIERDO);
						e.addJugador(extremoIz,8);
						break;
					case 10:
						System.out.println("\nGoles: ");
						int gol = sca.nextInt();
						Jugador extremoDer = new Extremo(nombre,dorsal,equipo,gol,PuestoDelantero.DERECHO);
						e.addJugador(extremoDer,9);
						break;
					case 11:
						System.out.println("\nGoles de Penalti: ");
						int golesDePenalti = sca.nextInt();
						System.out.println("\nGoles: ");
						int gole = sca.nextInt();
						Jugador delantero = new DelanteroCentro(nombre,dorsal,equipo,gole,golesDePenalti);
						e.addJugador(delantero,10);
						break;
				}
			case 2:
				for(Jugador jug:e.getJugadores()) {
					jug.mostrarDatos();
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
