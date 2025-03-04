package equipo.jugadores.centrocampistas;

public class Pivote extends Centrocampista {

	private int intercepciones;
	
	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
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
		return "Pivote"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Asistencias: "+ getIntercepciones()+ "Pases Completados: "+ getPasesCompletados()+ "}";
	}
	
	
}
