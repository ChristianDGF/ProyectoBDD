package logico;

public class Grupo {
	
	private String periodo;
	private String asignatura;
	private String numero_grupo;
	private int cupo;
	private String horario;
	
	public Grupo(String periodo, String asignatura, String numero_grupo, int cupo, String horario) {
		super();
		this.periodo = periodo;
		this.asignatura = asignatura;
		this.numero_grupo = numero_grupo;
		this.cupo = cupo;
		this.horario = horario;
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
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}
