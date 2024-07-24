package logico;

public class Grupos_Inscritos {
	
	private String periodo;
	private String asignatura;
	private String numero_grupo;
	private String estudiante;
	
	public Grupos_Inscritos(String periodo, String asignatura, String numero_grupo, String estudiante) {
		super();
		this.periodo = periodo;
		this.asignatura = asignatura;
		this.numero_grupo = numero_grupo;
		this.estudiante = estudiante;
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
	public String getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}
	
}
