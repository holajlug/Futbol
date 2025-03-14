package equipo.jugadores.defensas;

import equipo.jugadores.Jugador;

public class Lateral extends Defensa{
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas,Puesto puesto) {
		super(nombre, dorsal, equipo, disputasRealizadas);
		setPuesto(puesto);
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public String toString() {
		return  "Lateral"+ "{" + 
				"Nombre: "+ getNombre()+ 
				"Dorsal: "+ getDorsal() + 
				"Puesto: "+ getPuesto()+
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
