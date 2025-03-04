package equipo;

import java.util.ArrayList;
import java.util.List;

import equipo.jugadores.Jugador;

public class Equipo {
	private List<Jugador> jugadores;
	
	public Equipo() {
		this.jugadores = new ArrayList<Jugador>(); 
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void addJugador(Jugador ju) {
		if (ju == null) {
			throw new IllegalArgumentException("La pizza no puede ser nula");
		}
		jugadores.add(ju);
	}
	
}
