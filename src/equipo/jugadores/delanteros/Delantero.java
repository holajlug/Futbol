package equipo.jugadores.delanteros;

import equipo.jugadores.Jugador;
public abstract class Delantero extends Jugador {

	private int goles;
	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		setGoles(goles);
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		if(goles < 0 ) {
			throw new IllegalArgumentException("Los goles no pueden ser negativos");
		}
		this.goles = goles;
	}
	
	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Delantero"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Goles: "+ getGoles()+ "}";
	}
	@Override 
	public boolean equals(Object obj) {
		Delantero jug = (Delantero) obj;
		boolean resultado = false;
		if(jug.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}
}
