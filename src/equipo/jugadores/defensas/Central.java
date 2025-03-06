package equipo.jugadores.defensas;

import equipo.jugadores.Jugador;

public class Central extends Defensa{
	private Puesto puesto;
	private int entradas;
	
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas,int entradas,Puesto puesto) {
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
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Central"+ "{" + 
				"Nombre: "+ getNombre()+ 
				"Dorsal: "+ getDorsal() + 
				"Entradas: "+ getEntradas()+
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

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
}
