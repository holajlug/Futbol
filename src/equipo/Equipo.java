package equipo;

import equipo.jugadores.Jugador;

public class Equipo {
	private Jugador[] jugadores;
	int pos;
	
	public Equipo() {
		this.jugadores = new Jugador[11]; 
	}

	
	
	public Jugador[] getJugadores() {
		return jugadores;
	}



	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	
	 public void addJugador(Jugador ju, int pos) { // falta que en cada posición del array solo pueda entrar una posición de jugador
	        if (ju == null) {
	            throw new IllegalArgumentException("El jugador no puede ser nulo.");
	        }
	        if (pos >= 11) {
	            throw new IllegalStateException("El equipo ya tiene 11 jugadores.");
	        }
	        
	        jugadores[pos] = ju; // Agrega al primer espacio disponible
	    }
	
	public void mostrarAlineacion() {
		System.out.println("Portero: " + jugadores[0]);
		System.out.println("Lateral Izquierdo: " + jugadores[1]);
		System.out.println("Central: " + jugadores[2]);
		System.out.println("Central: " + jugadores[3]);
		System.out.println("Lateral derecho: " + jugadores[4]);
		System.out.println("Pivote: " + jugadores[5]);
		System.out.println("Pivote: " + jugadores[6]);
		System.out.println("Mediapunta: " + jugadores[7]);
		System.out.println("Extremo izquierdo: " + jugadores[8]);
		System.out.println("Extremo derecho: " + jugadores[9]);
		System.out.println("Delantero centro: " + jugadores[10]);
		
	}
	
}
