package equipo.jugadores;

public abstract class Jugador {

	private int id_Jug;
	private String nombre;
	private int dorsal;
	private String Equipo;
	
	private static int id_Cont = 1;
	
	public Jugador(String nombre, int dorsal, String equipo) {
		this.id_Jug= id_Cont++;
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.Equipo = equipo;
	}

	public int getId_Jug() {
		return id_Jug;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.equals(null) || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío o ser nulo");
		}
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		if(dorsal < 0 || dorsal > 100  ) {
			throw new IllegalArgumentException("El dorsal no puede ser negativo o mayor que 100");
		}
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		if(equipo.equals(null) || equipo.isBlank()) {
			throw new IllegalArgumentException("El equipo no puede estar vacío o ser nulo");
		}
		Equipo = equipo;
	}

	public static int getId_Cont() {
		return id_Cont;
	}

	@Override
	public String toString() {
		return "";
	}
	
	@Override 
	public boolean equals(Object obj) {
		Jugador jug = (Jugador) obj;
		boolean resultado = false;
		if(jug.getId_Jug() == this.getId_Jug()){
			resultado = true;
		}
		return resultado;
	}
}
