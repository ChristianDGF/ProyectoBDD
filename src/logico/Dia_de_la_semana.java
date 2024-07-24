package logico;

public class Dia_de_la_semana {

	private short numero_dia;
	private String nombre;
	private String nombre_corto;
	
	public Dia_de_la_semana(short numero_dia, String nombre, String nombre_corto) {
		super();
		this.numero_dia = numero_dia;
		this.nombre = nombre;
		this.nombre_corto = nombre_corto;
	}
	
	public short getNumero_dia() {
		return numero_dia;
	}
	public void setNumero_dia(short numero_dia) {
		this.numero_dia = numero_dia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_corto() {
		return nombre_corto;
	}
	public void setNombre_corto(String nombre_corto) {
		this.nombre_corto = nombre_corto;
	}
	
	
}
