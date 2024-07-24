package logico;

public class Asignatura {
	
	private String codigo;
	private String nombre;
	private int creditos;
	private int horas_teoricas;
	private int horas_practicas;
	
	public Asignatura(String codigo, String nombre, int creditos, int horas_teoricas, int horas_practicas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.horas_teoricas = horas_teoricas;
		this.horas_practicas = horas_practicas;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getHoras_teoricas() {
		return horas_teoricas;
	}
	public void setHoras_teoricas(int horas_teoricas) {
		this.horas_teoricas = horas_teoricas;
	}
	public int getHoras_practicas() {
		return horas_practicas;
	}
	public void setHoras_practicas(int horas_practicas) {
		this.horas_practicas = horas_practicas;
	}
	
}
