package equipo.jugadores.centrocampistas;

import equipo.jugadores.defensas.Puesto;

public class Pivote extends Centrocampista {

	private int intercepciones;
	private Puesto puesto;
	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones, Puesto puesto) {
		super(nombre, dorsal, equipo, pasesCompletados
				);
		setIntercepciones(intercepciones);
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		if(intercepciones < 0 ) {
			throw new IllegalArgumentException("Los pases no pueden ser negativos");
		}
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Pivote"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Intercepciones: "+ getIntercepciones()+ "Pases Completados: "+ getPasesCompletados()+ "}";
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	
}
