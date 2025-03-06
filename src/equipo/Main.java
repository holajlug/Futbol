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
		Portero p = new Portero("Iker", 1,"Betis", 1);// 1
		Portero ps = new Portero("Bounou", 13,"Betis", 1);// 2
		Central c1 = new Central("Sergio Ramos", 2,"Betis", 2,13,Puesto.IZQUIERDO);// 3
		Central c2 = new Central("Ramos", 2,"Betis", 2,13,Puesto.DERECHO);// 4
		Central cs = new Central("Sergio ", 2,"Betis", 2,13,Puesto.IZQUIERDO);// 5
		Lateral li = new Lateral("Kounde", 4,"Betis" ,1, Puesto.IZQUIERDO);//6
		Lateral lis = new Lateral("Arnold", 4,"Betis" ,1, Puesto.DERECHO);//7
		Lateral ld = new Lateral("Walker",3,"Betis" ,1, Puesto.DERECHO);//8
		Lateral lds = new Lateral("Frimpong",5,"Betis" ,1, Puesto.IZQUIERDO);//9
		Pivote piv1 = new Pivote("Busquets",5,"Betis",1,3, Puesto.IZQUIERDO);//10
		Pivote piv2 = new Pivote("Rodri",5,"Betis",1,3, Puesto.DERECHO);//11
		Pivote pivs = new Pivote("Gudelj", 5,"Betis",1,3, Puesto.DERECHO);//12
		Mediapunta md = new Mediapunta("Odegaard", 8,"Betis", 1,10);//13
		Mediapunta mds = new Mediapunta("Mount",28,"Betis", 1,10);//14
		Extremo ei = new Extremo("Cristiano Ronaldo", 11,"Betis", 24, PuestoDelantero.IZQUIERDO);//15
		Extremo eis = new Extremo("Raphina",11,"Betis", 24, PuestoDelantero.DERECHO);//16
		Extremo ed = new Extremo("Messi",11,"Betis", 24, PuestoDelantero.DERECHO);//17
		Extremo eds = new Extremo("Lamine yamal",11,"Betis", 24, PuestoDelantero.IZQUIERDO);//18
		DelanteroCentro dc = new DelanteroCentro("Lewandowski", 9,"Betis", 1, 12);//19
		DelanteroCentro dcs = new DelanteroCentro("iago aspas", 15,"Betis", 1, 12);//20
		System.out.println("\nCreamos un equipo e insertamos los jugadores: ");
		
		e.addJugador(p,0);
		e.addJugador(li,1);
		e.addJugador(c1,2);
		e.addJugador(c2,3);
		e.addJugador(lis,4);
		e.addJugador(piv1,5);
		e.addJugador(piv2,6);
		e.addJugador(md,7);
		e.addJugador(ei,8);
		e.addJugador(eis,9);
		e.addJugador(dc,10);
		
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
			System.out.println("3. Mostrar Alineación");
			System.out.println("4. Salir");
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
						e.addJugador(lateralDer,4);
						break;
					case 4:
						System.out.println("\nEntradas: ");
						int entradas = sca.nextInt();
						System.out.println("\nDisputas Realizadas: ");
						int disputas = sca.nextInt();
						Jugador centralIz = new Central(nombre,dorsal,equipo,disputas,entradas,Puesto.IZQUIERDO);
						e.addJugador(centralIz,2);
						break;
					case 5:
						System.out.println("\nEntradas: ");
						int entrada = sca.nextInt();
						System.out.println("\nDisputas Realizadas: ");
						int disputasReali = sca.nextInt();
						Jugador centralDer = new Central(nombre,dorsal,equipo,disputasReali,entrada,Puesto.DERECHO);
						e.addJugador(centralDer,3);
						break;
					case 6:
						System.out.println("\nIntercepciones: ");
						int intercepciones = sca.nextInt();
						System.out.println("\nPases Completado: ");
						int pasesCompletados = sca.nextInt();
						Jugador medioIz = new Pivote(nombre,dorsal,equipo,pasesCompletados,intercepciones,Puesto.IZQUIERDO);
						e.addJugador(medioIz,5);
						break;
					case 7:
						System.out.println("\nIntercepciones: ");
						int intercepcione = sca.nextInt();
						System.out.println("\nPases Completado: ");
						int pasesCompletado = sca.nextInt();
						Jugador medioDer = new Pivote(nombre,dorsal,equipo,pasesCompletado,intercepcione,Puesto.DERECHO);
						e.addJugador(medioDer,6);
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
				break;
			case 2:
				for(Jugador jug:e.getJugadores()) {
					jug.mostrarDatos();
				}
				break;
			case 3:
				e.mostrarAlineacion();
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
