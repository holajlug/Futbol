package equipo.jugadores.centrocampistas;

public class Mediapunta extends Centrocampista {

	private int asistencias;
	
	public Mediapunta(String nombre, int dorsal, String equipo, int pasesCompletados, int asistencias) {
		super(nombre, dorsal, equipo, pasesCompletados);
		setAsistencias(asistencias);
	}
	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		if(asistencias < 0 ) {
			throw new IllegalArgumentException("Los pases no pueden ser negativos");
		}
		this.asistencias = asistencias;
	}
	
	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "MediaPunta"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Asistencias: "+ getAsistencias()+ "Pases Completados: "+ getPasesCompletados()+ "}";
	}
	
}

