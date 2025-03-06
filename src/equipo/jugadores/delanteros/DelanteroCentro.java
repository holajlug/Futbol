package equipo.jugadores.delanteros;

public class DelanteroCentro extends Delantero{

	private int golesDePenalti;
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles, int golesDePenalti) {
		super(nombre, dorsal, equipo, goles);
		setGolesDePenalti(goles);
	}
	public int getGolesDePenalti() {
		return golesDePenalti;
	}
	public void setGolesDePenalti(int golesDePenalti) {
		this.golesDePenalti = golesDePenalti;
	}
	@Override
	public void mostrarDatos() {
	System.out.println(this.toString());
	}
		
	@Override
	public String toString() {
		return "Delantero Centro"+ "{" + "Nombre: "+ getNombre()+ " Dorsal: "+ getDorsal() + " Goles: "+ getGoles()+ " Goles de Penalti:"+ getGolesDePenalti()+  "}";
	}
}
