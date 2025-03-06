package equipo.jugadores.porteros;

import equipo.jugadores.Jugador;

public class Portero extends Jugador{
	
	private int paradas;
	
	public Portero(String nombre, int dorsal, String equipo,int paradas) {
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
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Portero"+ "{" + 
				"Nombre: "+ getNombre()+ 
				"Dorsal: "+ getDorsal() + 
				"Paradas: "+ getParadas()+
				"}";
	}
	@Override 
	public boolean equals(Object obj) {
		Portero jug = (Portero) obj;
		boolean resultado = false;
		if(jug.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}
}

