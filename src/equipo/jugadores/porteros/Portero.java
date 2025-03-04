package equipo.jugadores.porteros;

import equipo.jugadores.Jugador;

public class Portero extends Jugador{
	
	private int paradas;
	
	public Portero(String nombre, int dorsal, String equipo) {
		super(nombre, dorsal, equipo);
		setParadas(paradas);
	}

	public int getParadas() {
		return paradas;
	}

	public void setParadas(int paradas) {
		this.paradas = paradas;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override 
	public boolean equals(Object obj) {
		Portero port = (Portero) obj;
		boolean resultado = false;
		if(port.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}
	
}
