package equipo.jugadores.defensas;
public abstract class Lateral extends Defensa{
	private Puesto puesto;

	public Lateral(String nombre, int dorsal, String equipo, int disputasRealizadas) {
		super(nombre, dorsal, equipo, disputasRealizadas);
	
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	@Override
	public void mostrarDatos() {
		System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Lateral"+ "{" 
		+ "Nombre: "+ getNombre()
		+ "Dorsal: "+ getDorsal() 
		+ "Disputas: "+ getDisputasRealizadas()
		+ "Puesto: " +getPuesto()+ "}";
	}
	
}
