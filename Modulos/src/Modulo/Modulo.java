package Modulo;

public class Modulo {
	private String nombre;
	private String codigo;
	private int numero_horas;
	
	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre + ", codigo=" + codigo + ", numero_horas=" + numero_horas + "]";
	}
	public Modulo(String nombre, String codigo, int numero_horas) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.numero_horas = numero_horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getNumero_horas() {
		return numero_horas;
	}
	public void setNumero_horas(int numero_horas) {
		this.numero_horas = numero_horas;
	}
}
