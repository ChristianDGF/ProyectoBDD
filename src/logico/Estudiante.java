package logico;

public class Estudiante {
	
	private String codigo; 
	private String nombre;
	private String apellido;
	private String carrera;
	private String categoria_pago;
	private String nacionalidad;
	private String direccion;

	public Estudiante(String codigo, String nombre, String apellido, String carrera, String categoria_pago,
			String nacionalidad, String direccion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.categoria_pago = categoria_pago;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCategoria_pago() {
		return categoria_pago;
	}
	public void setCategoria_pago(String categoria_pago) {
		this.categoria_pago = categoria_pago;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
