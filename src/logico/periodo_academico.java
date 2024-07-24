package logico;

import java.time.LocalDate;

public class periodo_academico {

	private String codigo;
	private String descripcion;
	private LocalDate fecha_limite_prematricula;
	private LocalDate fecha_limite_retiro;
	private LocalDate fecha_limite_publicacion;
	
	public periodo_academico(String codigo, String descripcion, LocalDate fecha_limite_prematricula,
			LocalDate fecha_limite_retiro, LocalDate fecha_limite_publicacion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.fecha_limite_prematricula = fecha_limite_prematricula;
		this.fecha_limite_retiro = fecha_limite_retiro;
		this.fecha_limite_publicacion = fecha_limite_publicacion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha_limite_prematricula() {
		return fecha_limite_prematricula;
	}
	public void setFecha_limite_prematricula(LocalDate fecha_limite_prematricula) {
		this.fecha_limite_prematricula = fecha_limite_prematricula;
	}
	public LocalDate getFecha_limite_retiro() {
		return fecha_limite_retiro;
	}
	public void setFecha_limite_retiro(LocalDate fecha_limite_retiro) {
		this.fecha_limite_retiro = fecha_limite_retiro;
	}
	public LocalDate getFecha_limite_publicacion() {
		return fecha_limite_publicacion;
	}
	public void setFecha_limite_publicacion(LocalDate fecha_limite_publicacion) {
		this.fecha_limite_publicacion = fecha_limite_publicacion;
	}
	
	
}
