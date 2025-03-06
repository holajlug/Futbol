package equipo;

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

public class Equipo {
	private Jugador[] jugadores; 
	
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
        if (jugadores[pos] != null ) { // si la posicion NO es nula ya hay alguien en la posicion
        		throw new IllegalStateException("ya hay un jugador en esta posición");
        }
       
        //este jugador ya esta en otra posicion
        if (jugadores[pos] != null && jugadores[pos].getDorsal() == ju.getDorsal()) {
        	    throw new IllegalStateException("Este jugador ya está en otra posición.");
        }
         
        // Verificar si intentamos agregar un jugador no portero en la posición 0
        if (pos == 0 && !(ju instanceof Portero)) {
            throw new IllegalStateException("Solo un portero puede ocupar la posición 0.");
        }
        if (pos == 1 && !(ju instanceof Lateral) && !((Lateral)ju).getPuesto().equals(Puesto.IZQUIERDO)) {
            throw new IllegalStateException("Solo un lateral puede ocupar la posición 1.");
        }
        if ((pos == 2) && !(ju instanceof Central) && !((Central)ju).getPuesto().equals(Puesto.IZQUIERDO)) {
            throw new IllegalStateException("Solo un Central Izquierdo puede ocupar la posición 2.");
        }
        if((pos == 3 ) && !(ju instanceof Central) && !((Central)ju).getPuesto().equals(Puesto.DERECHO)) {
        	throw new IllegalStateException("Solo un Central Derecho puede ocupar la posición 3.");
        }
        if (pos == 4 && !(ju instanceof Lateral) && !((Lateral)ju).getPuesto().equals(Puesto.DERECHO)) {
            throw new IllegalStateException("Solo un lateral puede ocupar la posición 4.");
        }
        if ((pos == 5) && !(ju instanceof Pivote) && !((Pivote)ju).getPuesto().equals(Puesto.IZQUIERDO)) {
            throw new IllegalStateException("Solo un Pivote Izquierdo puede ocupar la posición 5.");
        }
        if (pos == 6 && !(ju instanceof Pivote) && !((Pivote)ju).getPuesto().equals(Puesto.DERECHO)) {
        	throw new IllegalStateException("Solo un Pivote Izquierdo puede ocupar la posición 6.");
        }
        if (pos == 7 && !(ju instanceof Mediapunta)) {
            throw new IllegalStateException("Solo un media punta puede ocupar la posición 7.");
        }
        if (pos == 8 && !(ju instanceof Extremo)&& !((Extremo)ju).getPuesto().equals(Puesto.IZQUIERDO)) {
            throw new IllegalStateException("Solo un extremo uede ocupar la posición 8.");
        }
        if (pos == 9 && !(ju instanceof Extremo)&& !((Extremo)ju).getPuesto().equals(Puesto.DERECHO)) {
            throw new IllegalStateException("Solo un Extremo puede ocupar la posición 9.");
        }
        if (pos == 10 && !(ju instanceof DelanteroCentro)) {
            throw new IllegalStateException("Solo un delantero centro puede ocupar la posición 10.");
        }
        
        jugadores[pos] = ju; // Agrega al primer espacio disponible
    }
	
	public void mostrarAlineacion() {
		System.out.println(jugadores[0]);
		System.out.println(jugadores[1]);
		System.out.println(jugadores[2]);
		System.out.println(jugadores[3]);
		System.out.println(jugadores[4]);
		System.out.println(jugadores[5]);
		System.out.println(jugadores[6]);
		System.out.println(jugadores[7]);
		System.out.println(jugadores[8]);
		System.out.println(jugadores[9]);
		System.out.println(jugadores[10]);
		
	}
	
}
