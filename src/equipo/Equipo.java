package equipo;

import equipo.jugadores.Jugador;
import equipo.jugadores.centrocampistas.Mediapunta;
import equipo.jugadores.centrocampistas.Pivote;
import equipo.jugadores.defensas.Central;
import equipo.jugadores.defensas.Lateral;
import equipo.jugadores.delanteros.DelanteroCentro;
import equipo.jugadores.delanteros.Extremo;
import equipo.jugadores.porteros.Portero;

public class Equipo {
	private Jugador[] jugadores; 
	private int pos;
	
	public Equipo() {
		this.jugadores = new Jugador[11]; 
	}

	
	
	public Jugador[] getJugadores() {
		return jugadores;
	}



	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	
	public void addJugador(Jugador ju, int pos) { 
        if (ju == null) {
            throw new IllegalArgumentException("El jugador no puede ser nulo.");
        }
        if (pos < 0 || pos >= 11) {
            throw new IndexOutOfBoundsException("Posición no valida. Debe estar entre 0 y 10.");
        }
        for (int i = 0; i < jugadores.length; i++) {
        	if (jugadores[i] != null ) { // si la posicion NO es nula ya hay alguien en la posicion
        		throw new IllegalStateException("ya hay un jugador en esta posición");
        	}
        }
        //este jugador ya esta en otra posicion
        for (int i = 0; i < jugadores.length; i++) {
        	if (jugadores[i].getDorsal() == ju.getDorsal()) {
        	    throw new IllegalStateException("Este jugador ya está en otra posición.");
        	}
        } 
        // Verificar si intentamos agregar un jugador no portero en la posición 0
        if (pos == 0 && !(ju instanceof Portero)) {
            throw new IllegalStateException("Solo un portero puede ocupar la posición 0.");
        }
        if (pos == 1 && !(ju instanceof Lateral)) { //falta concretar si izquierdo o derecho
            throw new IllegalStateException("Solo un lateral puede ocupar la posición 1.");
        }
        if ((pos == 2 || pos == 3) && !(ju instanceof Central)) {
            throw new IllegalStateException("Solo un central puede ocupar la posición 2 o 3.");
        }
        if (pos == 4 && !(ju instanceof Lateral)) {//falta concretar si izquierdo o derecho
            throw new IllegalStateException("Solo un lateral puede ocupar la posición 4.");
        }
        if ((pos == 5 || pos == 6) && !(ju instanceof Pivote)) {
            throw new IllegalStateException("Solo un pivote puede ocupar la posición 5 o 6.");
        }
        if (pos == 7 && !(ju instanceof Mediapunta)) {
            throw new IllegalStateException("Solo un media punta puede ocupar la posición 7.");
        }
        if (pos == 8 && !(ju instanceof Extremo)) {//falta concretar si izquierdo o derecho
            throw new IllegalStateException("Solo un extremo uede ocupar la posición 8.");
        }
        if (pos == 9 && !(ju instanceof Extremo)) {//falta concretar si izquierdo o derecho
            throw new IllegalStateException("Solo un Extremo puede ocupar la posición 9.");
        }
        if (pos == 10 && !(ju instanceof DelanteroCentro)) {
            throw new IllegalStateException("Solo un delantero centro puede ocupar la posición 10.");
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
