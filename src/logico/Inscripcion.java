package logico;

import java.time.LocalDate;

public class Inscripcion {

	private String periodo;
	private String estudiante;
	private LocalDate fecha;
	
	public Inscripcion(String periodo, String estudiante, LocalDate fecha) {
		super();
		this.periodo = periodo;
		this.estudiante = estudiante;
		this.fecha = fecha;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
}
