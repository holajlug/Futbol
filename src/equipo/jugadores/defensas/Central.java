package equipo.jugadores.defensas;

public abstract class Central extends Defensa{
	
	private int entradas;
	
	public Central(String nombre, int dorsal, String equipo, int disputasRealizadas,int entradas) {
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
		return "Central"+ "{" + "Nombre: "+ getNombre()
		+ "Dorsal: "+ getDorsal() 
		+ "Disputas: "+ getDisputasRealizadas()
		+ "Puesto: " +getEntradas()+ "}";
	}
	
	
}
