package equipo.jugadores.defensas;

import equipo.jugadores.Jugador;

public abstract class Central extends Defensa{
	
	private int entradas;
	
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas,int entradas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setEntradas(entradas);
	}
	
	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override 
	public boolean equals(Object obj) {
		Jugador jug = (Jugador) obj;
		boolean resultado = false;
		if(jug.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}
}
