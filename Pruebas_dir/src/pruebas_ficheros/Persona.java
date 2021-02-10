package pruebas_ficheros;

public class Persona {
	private String nombre;
	private String apellidos;
	private int numerotel;
	
	public Persona(String nombre, String apellidos, int numerotel) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.numerotel = numerotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNumerotel() {
		return numerotel;
	}

	public void setNumerotel(int numerotel) {
		this.numerotel = numerotel;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", numerotel=" + numerotel + "]";
	}

	public char[] mostarDatos(int longitudlinea) {
		
		return null;
	}
	
}
