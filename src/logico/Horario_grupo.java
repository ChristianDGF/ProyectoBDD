package logico;

import java.time.LocalTime;

public class Horario_grupo {
	private String periodo;
	private String asignatura;
	private String numero_grupo;
	private short numero_dia;
	private LocalTime hora_inicio;
	
	public Horario_grupo(String periodo, String asignatura, String numero_grupo, short numero_dia,
			LocalTime hora_inicio) {
		super();
		this.periodo = periodo;
		this.asignatura = asignatura;
		this.numero_grupo = numero_grupo;
		this.numero_dia = numero_dia;
		this.hora_inicio = hora_inicio;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getNumero_grupo() {
		return numero_grupo;
	}
	public void setNumero_grupo(String numero_grupo) {
		this.numero_grupo = numero_grupo;
	}
	public short getNumero_dia() {
		return numero_dia;
	}
	public void setNumero_dia(short numero_dia) {
		this.numero_dia = numero_dia;
	}
	public LocalTime getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(LocalTime hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
}
