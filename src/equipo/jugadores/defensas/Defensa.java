package equipo.jugadores.defensas;

import equipo.jugadores.Jugador;

public abstract class Defensa extends Jugador{
	
	private int disputasRealizadas;
	
	public Defensa(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo);
		this.disputasRealizadas = disputasRealizadas;
	}

	public int getDisputasRealizadas() {
		return disputasRealizadas;
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		this.disputasRealizadas = disputasRealizadas;
	}
	
	
	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return  "Defensa"+ "{" + 
				"Nombre: "+ getNombre()+ 
				"Dorsal: "+ getDorsal() + 
				"Disputas realizadas: "+ getDisputasRealizadas()+
				"}";
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

