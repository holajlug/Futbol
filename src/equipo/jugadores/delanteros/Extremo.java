package equipo.jugadores.delanteros;

public class Extremo extends Delantero {

	
	private PuestoDelantero puesto;
	
	public Extremo(String nombre, int dorsal, String equipo, int goles,PuestoDelantero puesto) {
		super(nombre, dorsal, equipo, goles);
		setPuesto(getPuesto());
	}
	public String getPuesto() {
		return puesto.toString();
	}
	public void setPuesto(String puesto) {
		this.puesto = PuestoDelantero.valueOf(puesto);
	}

	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Extremo"+ "{" + "Nombre: "+ getNombre()+ "Dorsal: "+ getDorsal() + "Goles: "+ getGoles()+ "Puesto:"+ getPuesto()+  "}";
	}
}

