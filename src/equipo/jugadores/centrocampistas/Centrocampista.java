package equipo.jugadores.centrocampistas;

import equipo.jugadores.Jugador;

public abstract class Centrocampista extends Jugador{

	private int pasesCompletados;
	
	public Centrocampista(String nombre, int dorsal, String equipo,int pasesCompletados) {
		super(nombre, dorsal, equipo);
		setPasesCompletados(pasesCompletados);
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		if(pasesCompletados < 0 ) {
			throw new IllegalArgumentException("Los pases no pueden ser negativos");
		}
		this.pasesCompletados = pasesCompletados;
	}

	public abstract void mostrarDatos();
	
	@Override
	public String toString() {
		return "Centrocampista"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Pases Completados: "+getPasesCompletados()+"}";
	}
	
	@Override 
	public boolean equals(Object obj) {
		Centrocampista jug = (Centrocampista) obj;
		boolean resultado = false;
		if(jug.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}

}