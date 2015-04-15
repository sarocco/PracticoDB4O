package Ejemplo;

public class Persona {
	
	public String getNombre() {
		return nombre;
	}
	
	private int documento;

	private String nombre;
	
	private String apellido;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}



}
